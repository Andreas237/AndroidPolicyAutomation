.class public final Lcom/google/protobuf/FloatValue$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/FloatValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/FloatValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/FloatValue$Builder;>;Lcom/google/protobuf/FloatValueOrBuilder;"
    }
.end annotation


# instance fields
.field private value_:F


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 279
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 280
    invoke-direct {p0}, Lcom/google/protobuf/FloatValue$Builder;->maybeForceBuilderInitialization()V

    .line 281
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/FloatValue$1;)V
    .locals 0

    .line 262
    invoke-direct {p0}, Lcom/google/protobuf/FloatValue$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 285
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 286
    invoke-direct {p0}, Lcom/google/protobuf/FloatValue$Builder;->maybeForceBuilderInitialization()V

    .line 287
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/FloatValue$1;)V
    .locals 0

    .line 262
    invoke-direct {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 268
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_FloatValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 289
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 292
    return-void
.end method


# virtual methods
.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 348
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/FloatValue;
    .locals 2

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->buildPartial()Lcom/google/protobuf/FloatValue;

    move-result-object v1

    .line 311
    invoke-virtual {v1}, Lcom/google/protobuf/FloatValue;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 312
    invoke-static {v1}, Lcom/google/protobuf/FloatValue$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 314
    :cond_0
    return-object v1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->build()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->build()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/FloatValue;
    .locals 2

    .line 318
    new-instance v1, Lcom/google/protobuf/FloatValue;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/protobuf/FloatValue;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/FloatValue$1;)V

    .line 319
    iget v0, p0, Lcom/google/protobuf/FloatValue$Builder;->value_:F

    invoke-static {v1, v0}, Lcom/google/protobuf/FloatValue;->access$302(Lcom/google/protobuf/FloatValue;F)F

    .line 320
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->onBuilt()V

    .line 321
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->buildPartial()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->buildPartial()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clear()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 294
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 295
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/FloatValue$Builder;->value_:F

    .line 297
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clear()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clear()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clear()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 334
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 338
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearValue()Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 424
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/FloatValue$Builder;->value_:F

    .line 425
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->onChanged()V

    .line 426
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 325
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

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

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->clone()Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/FloatValue;
    .locals 1

    .line 306
    invoke-static {}, Lcom/google/protobuf/FloatValue;->getDefaultInstance()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 302
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_FloatValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getValue()F
    .locals 1

    .line 400
    iget v0, p0, Lcom/google/protobuf/FloatValue$Builder;->value_:F

    return v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 273
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_FloatValue_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/FloatValue;

    const-class v2, Lcom/google/protobuf/FloatValue$Builder;

    .line 274
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 273
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 370
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

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/FloatValue$Builder;

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

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 377
    const/4 v1, 0x0

    .line 379
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/FloatValue;->access$400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 384
    if-eqz v1, :cond_1

    .line 385
    invoke-virtual {p0, v1}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/FloatValue;)Lcom/google/protobuf/FloatValue$Builder;

    goto :goto_0

    .line 380
    :catch_0
    move-exception v2

    .line 381
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue;

    move-object v1, v0

    .line 382
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 384
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 385
    invoke-virtual {p0, v1}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/FloatValue;)Lcom/google/protobuf/FloatValue$Builder;

    :cond_0
    throw v3

    .line 388
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/FloatValue;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 2

    .line 360
    invoke-static {}, Lcom/google/protobuf/FloatValue;->getDefaultInstance()Lcom/google/protobuf/FloatValue;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 361
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 362
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/FloatValue$Builder;->setValue(F)Lcom/google/protobuf/FloatValue$Builder;

    .line 364
    :cond_1
    iget-object v0, p1, Lcom/google/protobuf/FloatValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/FloatValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->onChanged()V

    .line 366
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 351
    instance-of v0, p1, Lcom/google/protobuf/FloatValue;

    if-eqz v0, :cond_0

    .line 352
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/FloatValue;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/FloatValue;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0

    .line 354
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 355
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/FloatValue$Builder;

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

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 435
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 330
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/FloatValue$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 343
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/FloatValue$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/FloatValue$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;
    .locals 1

    .line 430
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FloatValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/protobuf/FloatValue$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/FloatValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setValue(F)Lcom/google/protobuf/FloatValue$Builder;
    .locals 0

    .line 411
    iput p1, p0, Lcom/google/protobuf/FloatValue$Builder;->value_:F

    .line 412
    invoke-virtual {p0}, Lcom/google/protobuf/FloatValue$Builder;->onChanged()V

    .line 413
    return-object p0
.end method
