.class public abstract Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessageV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ExtendableBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage;BuilderType:Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder<TMessageType;TBuilderType;>;>Lcom/google/protobuf/GeneratedMessageV3$Builder<TBuilderType;>;Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessageOrBuilder<TMessageType;>;"
    }
.end annotation


# instance fields
.field private extensions:Lcom/google/protobuf/FieldSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/Descriptors$FieldDescriptor;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1237
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 1235
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1237
    return-void
.end method

.method protected constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 1241
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 1235
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1242
    return-void
.end method

.method static synthetic access$400(Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;)Lcom/google/protobuf/FieldSet;
    .locals 1

    .line 1229
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->buildExtensions()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    return-object v0
.end method

.method private buildExtensions()Lcom/google/protobuf/FieldSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/Descriptors$FieldDescriptor;>;"
        }
    .end annotation

    .line 1485
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->makeImmutable()V

    .line 1486
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    return-object v0
.end method

.method private ensureExtensionsIsMutable()V
    .locals 1

    .line 1256
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->isImmutable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1257
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->clone()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1259
    :cond_0
    return-void
.end method

.method private verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V
    .locals 2

    .line 1618
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1619
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1622
    :cond_0
    return-void
.end method

.method private verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Extension<TMessageType;*>;)V"
        }
    .end annotation

    .line 1263
    invoke-virtual {p1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    .line 1264
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1266
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Extension is for type \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1268
    invoke-virtual {p1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" which does not match message type \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1270
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1272
    :cond_0
    return-void
.end method


# virtual methods
.method public final addExtension(Lcom/google/protobuf/Extension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1457
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1363
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1365
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1366
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1367
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1368
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1369
    invoke-virtual {v2, p2}, Lcom/google/protobuf/Extension;->singularToReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1368
    invoke-virtual {v0, v3, v1}, Lcom/google/protobuf/FieldSet;->addRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1370
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1371
    return-object p0
.end method

.method public addExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1462
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1600
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1601
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1602
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1603
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->addRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1604
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1605
    return-object p0

    .line 1607
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    .line 1251
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1252
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final clearExtension(Lcom/google/protobuf/Extension;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1467
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1377
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1379
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1380
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1381
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/FieldSet;->clearField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)V

    .line 1382
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1383
    return-object p0
.end method

.method public clearExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1472
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;)TBuilderType;"
        }
    .end annotation

    .line 1572
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1573
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1574
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1575
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->clearField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)V

    .line 1576
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1577
    return-object p0

    .line 1579
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected extensionsAreInitialized()Z
    .locals 1

    .line 1477
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->isInitialized()Z

    move-result v0

    return v0
.end method

.method public getAllFields()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 1499
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->access$900(Lcom/google/protobuf/GeneratedMessageV3$Builder;)Ljava/util/Map;

    move-result-object v1

    .line 1500
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1501
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/Extension;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;TType;>;)TType;"
        }
    .end annotation

    .line 1412
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/Extension;I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;I)TType;"
        }
    .end annotation

    .line 1424
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;TType;>;)TType;"
        }
    .end annotation

    .line 1297
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1299
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1300
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1301
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, v3}, Lcom/google/protobuf/FieldSet;->getField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Ljava/lang/Object;

    move-result-object v4

    .line 1302
    if-nez v4, :cond_2

    .line 1303
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1304
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1305
    :cond_0
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_1

    .line 1307
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getMessageDefaultInstance()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    return-object v0

    .line 1309
    .line 1310
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    .line 1309
    invoke-virtual {v2, v0}, Lcom/google/protobuf/Extension;->fromReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1313
    :cond_2
    invoke-virtual {v2, v4}, Lcom/google/protobuf/Extension;->fromReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/ExtensionLite;I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;I)TType;"
        }
    .end annotation

    .line 1321
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v1

    .line 1323
    invoke-direct {p0, v1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1324
    invoke-virtual {v1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v2

    .line 1325
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1326
    invoke-virtual {v0, v2, p2}, Lcom/google/protobuf/FieldSet;->getRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;I)Ljava/lang/Object;

    move-result-object v0

    .line 1325
    invoke-virtual {v1, v0}, Lcom/google/protobuf/Extension;->singularFromReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;TType;>;)TType;"
        }
    .end annotation

    .line 1418
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;I)TType;"
        }
    .end annotation

    .line 1430
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getExtensionCount(Lcom/google/protobuf/Extension;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;)I"
        }
    .end annotation

    .line 1401
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtensionCount(Lcom/google/protobuf/ExtensionLite;)I

    move-result v0

    return v0
.end method

.method public final getExtensionCount(Lcom/google/protobuf/ExtensionLite;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;)I"
        }
    .end annotation

    .line 1287
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v1

    .line 1289
    invoke-direct {p0, v1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1290
    invoke-virtual {v1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v2

    .line 1291
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, v2}, Lcom/google/protobuf/FieldSet;->getRepeatedFieldCount(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)I

    move-result v0

    return v0
.end method

.method public final getExtensionCount(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;)I"
        }
    .end annotation

    .line 1407
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->getExtensionCount(Lcom/google/protobuf/ExtensionLite;)I

    move-result v0

    return v0
.end method

.method public getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 3

    .line 1506
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1507
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1508
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->getField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Ljava/lang/Object;

    move-result-object v2

    .line 1509
    if-nez v2, :cond_1

    .line 1510
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_0

    .line 1513
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getMessageType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/DynamicMessage;->getDefaultInstance(Lcom/google/protobuf/Descriptors$Descriptor;)Lcom/google/protobuf/DynamicMessage;

    move-result-object v0

    return-object v0

    .line 1515
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1518
    :cond_1
    return-object v2

    .line 1521
    :cond_2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;
    .locals 1

    .line 1538
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1539
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1540
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->getRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1542
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I
    .locals 1

    .line 1527
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1528
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1529
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->getRepeatedFieldCount(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)I

    move-result v0

    return v0

    .line 1531
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I

    move-result v0

    return v0
.end method

.method public final hasExtension(Lcom/google/protobuf/Extension;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;TType;>;)Z"
        }
    .end annotation

    .line 1389
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->hasExtension(Lcom/google/protobuf/ExtensionLite;)Z

    move-result v0

    return v0
.end method

.method public final hasExtension(Lcom/google/protobuf/ExtensionLite;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;TType;>;)Z"
        }
    .end annotation

    .line 1277
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1279
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1280
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/FieldSet;->hasField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Z

    move-result v0

    return v0
.end method

.method public final hasExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;TType;>;)Z"
        }
    .end annotation

    .line 1395
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->hasExtension(Lcom/google/protobuf/ExtensionLite;)Z

    move-result v0

    return v0
.end method

.method public hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 1

    .line 1548
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1549
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1550
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->hasField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Z

    move-result v0

    return v0

    .line 1552
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    return v0
.end method

.method internalSetExtensionSet(Lcom/google/protobuf/FieldSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/Descriptors$FieldDescriptor;>;)V"
        }
    .end annotation

    .line 1246
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1247
    return-void
.end method

.method public isInitialized()Z
    .locals 1

    .line 1491
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensionsAreInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final mergeExtensionFields(Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage;)V
    .locals 2

    .line 1612
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1613
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage;->access$600(Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage;)Lcom/google/protobuf/FieldSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/FieldSet;->mergeFrom(Lcom/google/protobuf/FieldSet;)V

    .line 1614
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1615
    return-void
.end method

.method public final setExtension(Lcom/google/protobuf/Extension;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1446
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final setExtension(Lcom/google/protobuf/Extension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1435
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1347
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1349
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1350
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1351
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1352
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1354
    invoke-virtual {v2, p3}, Lcom/google/protobuf/Extension;->singularToReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1352
    invoke-virtual {v0, v3, p2, v1}, Lcom/google/protobuf/FieldSet;->setRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;ILjava/lang/Object;)V

    .line 1355
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1356
    return-object p0
.end method

.method public final setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1333
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageV3;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1335
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1336
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1337
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1338
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v2, p2}, Lcom/google/protobuf/Extension;->toReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/google/protobuf/FieldSet;->setField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1339
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1340
    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1452
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1440
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1559
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1560
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1561
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1562
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->setField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1563
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1564
    return-object p0

    .line 1566
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1586
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1587
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1588
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1589
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/protobuf/FieldSet;->setRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;ILjava/lang/Object;)V

    .line 1590
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->onChanged()V

    .line 1591
    return-object p0

    .line 1593
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1228
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method
