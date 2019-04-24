.class public Lcom/google/protobuf/MapEntry$Builder;
.super Lcom/google/protobuf/AbstractMessage$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/MapEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/google/protobuf/AbstractMessage$Builder<Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private hasKey:Z

.field private hasValue:Z

.field private key:Ljava/lang/Object;
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

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapEntry$Metadata<TK;TV;>;)V"
        }
    .end annotation

    .line 253
    move-object v0, p0

    move-object v1, p1

    iget-object v2, p1, Lcom/google/protobuf/MapEntry$Metadata;->defaultKey:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZ)V

    .line 254
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Lcom/google/protobuf/MapEntry$1;)V
    .locals 0

    .line 244
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapEntry$Metadata<TK;TV;>;TK;TV;ZZ)V"
        }
    .end annotation

    .line 256
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage$Builder;-><init>()V

    .line 257
    iput-object p1, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    .line 258
    iput-object p2, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    .line 259
    iput-object p3, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    .line 260
    iput-boolean p4, p0, Lcom/google/protobuf/MapEntry$Builder;->hasKey:Z

    .line 261
    iput-boolean p5, p0, Lcom/google/protobuf/MapEntry$Builder;->hasValue:Z

    .line 262
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZLcom/google/protobuf/MapEntry$1;)V
    .locals 0

    .line 244
    invoke-direct/range {p0 .. p5}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZ)V

    return-void
.end method

.method private checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V
    .locals 3

    .line 316
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, v1, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    if-eq v0, v1, :cond_0

    .line 317
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong FieldDescriptor \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 318
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" used in message \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, v2, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 319
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 321
    :cond_0
    return-void
.end method


# virtual methods
.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 380
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/MapEntry$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/MapEntry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry<TK;TV;>;"
        }
    .end annotation

    .line 298
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->buildPartial()Lcom/google/protobuf/MapEntry;

    move-result-object v1

    .line 299
    invoke-virtual {v1}, Lcom/google/protobuf/MapEntry;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    invoke-static {v1}, Lcom/google/protobuf/MapEntry$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 302
    :cond_0
    return-object v1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/MapEntry;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry<TK;TV;>;"
        }
    .end annotation

    .line 307
    new-instance v0, Lcom/google/protobuf/MapEntry;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/protobuf/MapEntry$1;)V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->buildPartial()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->buildPartial()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 362
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 363
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 364
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clearKey()Lcom/google/protobuf/MapEntry$Builder;

    goto :goto_0

    .line 366
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clearValue()Lcom/google/protobuf/MapEntry$Builder;

    .line 368
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearKey()Lcom/google/protobuf/MapEntry$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 279
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->defaultKey:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    .line 280
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasKey:Z

    .line 281
    return-object p0
.end method

.method public clearValue()Lcom/google/protobuf/MapEntry$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    .line 292
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasValue:Z

    .line 293
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clone()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clone()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/MapEntry$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 448
    new-instance v0, Lcom/google/protobuf/MapEntry$Builder;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    iget-boolean v4, p0, Lcom/google/protobuf/MapEntry$Builder;->hasKey:Z

    iget-boolean v5, p0, Lcom/google/protobuf/MapEntry$Builder;->hasValue:Z

    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZ)V

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clone()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clone()Lcom/google/protobuf/MapEntry$Builder;

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

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->clone()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAllFields()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 402
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 403
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

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

    .line 404
    invoke-virtual {p0, v3}, Lcom/google/protobuf/MapEntry$Builder;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    invoke-virtual {p0, v3}, Lcom/google/protobuf/MapEntry$Builder;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    :cond_0
    goto :goto_0

    .line 408
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry<TK;TV;>;"
        }
    .end annotation

    .line 392
    new-instance v0, Lcom/google/protobuf/MapEntry;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, v2, Lcom/google/protobuf/MapEntry$Metadata;->defaultKey:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v3, v3, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/protobuf/MapEntry$1;)V

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 3

    .line 419
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 420
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->getKey()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry$Builder;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 422
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    if-ne v0, v1, :cond_1

    .line 423
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getEnumType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    move-object v1, v2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->findValueByNumberCreatingIfUnknown(I)Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    move-result-object v2

    .line 425
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

    .line 265
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;
    .locals 2

    .line 436
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I
    .locals 2

    .line 430
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 442
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

    .line 269
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 2

    .line 413
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 414
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasKey:Z

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasValue:Z

    :goto_0
    return v0
.end method

.method public isInitialized()Z
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/google/protobuf/MapEntry;->access$600(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public newBuilderForField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 3

    .line 325
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 328
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 329
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-eq v0, v1, :cond_1

    .line 330
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 331
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a message value field."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/Message;

    invoke-interface {v0}, Lcom/google/protobuf/Message;->newBuilderForType()Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 339
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 340
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 341
    invoke-virtual {p0, p2}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    goto :goto_1

    .line 343
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    if-ne v0, v1, :cond_1

    .line 344
    move-object v0, p2

    check-cast v0, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    .line 345
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    if-ne v0, v1, :cond_2

    .line 346
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 351
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Builder;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/Message;

    .line 352
    invoke-interface {v0}, Lcom/google/protobuf/Message;->toBuilder()Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lcom/google/protobuf/Message;

    invoke-interface {v0, v1}, Lcom/google/protobuf/Message$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/Message$Builder;->build()Lcom/google/protobuf/Message;

    move-result-object p2

    .line 355
    :cond_2
    :goto_0
    invoke-virtual {p0, p2}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    .line 357
    :goto_1
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/MapEntry$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 273
    iput-object p1, p0, Lcom/google/protobuf/MapEntry$Builder;->key:Ljava/lang/Object;

    .line 274
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasKey:Z

    .line 275
    return-object p0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 374
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/MapEntry$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 387
    return-object p0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 244
    invoke-virtual {p0, p1}, Lcom/google/protobuf/MapEntry$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 285
    iput-object p1, p0, Lcom/google/protobuf/MapEntry$Builder;->value:Ljava/lang/Object;

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/MapEntry$Builder;->hasValue:Z

    .line 287
    return-object p0
.end method
