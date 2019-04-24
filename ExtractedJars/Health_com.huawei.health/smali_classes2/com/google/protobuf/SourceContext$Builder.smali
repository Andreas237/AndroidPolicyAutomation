.class public final Lcom/google/protobuf/SourceContext$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/SourceContextOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/SourceContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/SourceContext$Builder;>;Lcom/google/protobuf/SourceContextOrBuilder;"
    }
.end annotation


# instance fields
.field private fileName_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 307
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 420
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 308
    invoke-direct {p0}, Lcom/google/protobuf/SourceContext$Builder;->maybeForceBuilderInitialization()V

    .line 309
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 313
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 420
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 314
    invoke-direct {p0}, Lcom/google/protobuf/SourceContext$Builder;->maybeForceBuilderInitialization()V

    .line 315
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/SourceContext$1;)V
    .locals 0

    .line 290
    invoke-direct {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/SourceContext$1;)V
    .locals 0

    .line 290
    invoke-direct {p0}, Lcom/google/protobuf/SourceContext$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 296
    sget-object v0, Lcom/google/protobuf/SourceContextProto;->internal_static_google_protobuf_SourceContext_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 317
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 320
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 376
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->build()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->build()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/SourceContext;
    .locals 2

    .line 338
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->buildPartial()Lcom/google/protobuf/SourceContext;

    move-result-object v1

    .line 339
    invoke-virtual {v1}, Lcom/google/protobuf/SourceContext;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 340
    invoke-static {v1}, Lcom/google/protobuf/SourceContext$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 342
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->buildPartial()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->buildPartial()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/SourceContext;
    .locals 2

    .line 346
    new-instance v1, Lcom/google/protobuf/SourceContext;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/protobuf/SourceContext;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/SourceContext$1;)V

    .line 347
    iget-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/google/protobuf/SourceContext;->access$302(Lcom/google/protobuf/SourceContext;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onBuilt()V

    .line 349
    return-object v1
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clear()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clear()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clear()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clear()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 322
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 323
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 325
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 362
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public clearFileName()Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 490
    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SourceContext;->getFileName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 491
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onChanged()V

    .line 492
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 366
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 353
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->clone()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/SourceContext;
    .locals 1

    .line 334
    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 330
    sget-object v0, Lcom/google/protobuf/SourceContextProto;->internal_static_google_protobuf_SourceContext_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 4

    .line 430
    iget-object v1, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 431
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 432
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 434
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 435
    iput-object v3, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 436
    return-object v3

    .line 438
    :cond_0
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getFileNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 451
    iget-object v1, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 452
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 453
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 454
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 456
    iput-object v2, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 457
    return-object v2

    .line 459
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 301
    sget-object v0, Lcom/google/protobuf/SourceContextProto;->internal_static_google_protobuf_SourceContext_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/SourceContext;

    const-class v2, Lcom/google/protobuf/SourceContext$Builder;

    .line 302
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 301
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 399
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

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/SourceContext$Builder;

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

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/SourceContext$Builder;

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

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/SourceContext$Builder;

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

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 406
    const/4 v1, 0x0

    .line 408
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/SourceContext;->access$400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 413
    if-eqz v1, :cond_1

    .line 414
    invoke-virtual {p0, v1}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext$Builder;

    goto :goto_0

    .line 409
    :catch_0
    move-exception v2

    .line 410
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext;

    move-object v1, v0

    .line 411
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 414
    invoke-virtual {p0, v1}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext$Builder;

    :cond_0
    throw v3

    .line 417
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 379
    instance-of v0, p1, Lcom/google/protobuf/SourceContext;

    if-eqz v0, :cond_0

    .line 380
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/SourceContext;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0

    .line 382
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 383
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 388
    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 389
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/SourceContext;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 390
    invoke-static {p1}, Lcom/google/protobuf/SourceContext;->access$300(Lcom/google/protobuf/SourceContext;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 391
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onChanged()V

    .line 393
    :cond_1
    iget-object v0, p1, Lcom/google/protobuf/SourceContext;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/SourceContext$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    .line 394
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onChanged()V

    .line 395
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 520
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/SourceContext$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 358
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public setFileName(Ljava/lang/String;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 472
    if-nez p1, :cond_0

    .line 473
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 476
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 477
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onChanged()V

    .line 478
    return-object p0
.end method

.method public setFileNameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 504
    if-nez p1, :cond_0

    .line 505
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 507
    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 509
    iput-object p1, p0, Lcom/google/protobuf/SourceContext$Builder;->fileName_:Ljava/lang/Object;

    .line 510
    invoke-virtual {p0}, Lcom/google/protobuf/SourceContext$Builder;->onChanged()V

    .line 511
    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/SourceContext$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/SourceContext$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 371
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/google/protobuf/SourceContext$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/SourceContext$Builder;
    .locals 1

    .line 515
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext$Builder;

    return-object v0
.end method
