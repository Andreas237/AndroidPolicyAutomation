.class public abstract Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessage$ExtendableMessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ExtendableBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;BuilderType:Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder<TMessageType;TBuilderType;>;>Lcom/google/protobuf/GeneratedMessage$Builder<TBuilderType;>;Lcom/google/protobuf/GeneratedMessage$ExtendableMessageOrBuilder<TMessageType;>;"
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

    .line 1192
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 1190
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1192
    return-void
.end method

.method protected constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 1196
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 1190
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1197
    return-void
.end method

.method static synthetic access$400(Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;)Lcom/google/protobuf/FieldSet;
    .locals 1

    .line 1184
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->buildExtensions()Lcom/google/protobuf/FieldSet;

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

    .line 1448
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->makeImmutable()V

    .line 1449
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    return-object v0
.end method

.method private ensureExtensionsIsMutable()V
    .locals 1

    .line 1219
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->isImmutable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1220
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->clone()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1222
    :cond_0
    return-void
.end method

.method private verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V
    .locals 2

    .line 1596
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1597
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1600
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

    .line 1226
    invoke-virtual {p1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    .line 1227
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1229
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Extension is for type \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1231
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

    .line 1233
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

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

    .line 1235
    :cond_0
    return-void
.end method


# virtual methods
.method public final addExtension(Lcom/google/protobuf/Extension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1420
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1326
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1328
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1329
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1330
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1331
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1332
    invoke-virtual {v2, p2}, Lcom/google/protobuf/Extension;->singularToReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1331
    invoke-virtual {v0, v3, v1}, Lcom/google/protobuf/FieldSet;->addRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1333
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1334
    return-object p0
.end method

.method public addExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1425
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->addExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1578
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1579
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1580
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1581
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->addRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1582
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1583
    return-object p0

    .line 1585
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    .line 1206
    invoke-static {}, Lcom/google/protobuf/FieldSet;->emptySet()Lcom/google/protobuf/FieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1207
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clear()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final clearExtension(Lcom/google/protobuf/Extension;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1430
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1340
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1342
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1343
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1344
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/FieldSet;->clearField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)V

    .line 1345
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1346
    return-object p0
.end method

.method public clearExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;*>;)TBuilderType;"
        }
    .end annotation

    .line 1435
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clearExtension(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;)TBuilderType;"
        }
    .end annotation

    .line 1550
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1551
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1552
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1553
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->clearField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)V

    .line 1554
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1555
    return-object p0

    .line 1557
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    .line 1215
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clone()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

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

    .line 1183
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->clone()Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected extensionsAreInitialized()Z
    .locals 1

    .line 1440
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

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

    .line 1477
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->access$900(Lcom/google/protobuf/GeneratedMessage$Builder;)Ljava/util/Map;

    move-result-object v1

    .line 1478
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/FieldSet;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1479
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

    .line 1375
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;

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

    .line 1387
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;I)Ljava/lang/Object;

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

    .line 1260
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1262
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1263
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1264
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, v3}, Lcom/google/protobuf/FieldSet;->getField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Ljava/lang/Object;

    move-result-object v4

    .line 1265
    if-nez v4, :cond_2

    .line 1266
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1267
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1268
    :cond_0
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_1

    .line 1270
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getMessageDefaultInstance()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    return-object v0

    .line 1272
    .line 1273
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    .line 1272
    invoke-virtual {v2, v0}, Lcom/google/protobuf/Extension;->fromReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1276
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

    .line 1284
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v1

    .line 1286
    invoke-direct {p0, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1287
    invoke-virtual {v1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v2

    .line 1288
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1289
    invoke-virtual {v0, v2, p2}, Lcom/google/protobuf/FieldSet;->getRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;I)Ljava/lang/Object;

    move-result-object v0

    .line 1288
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

    .line 1381
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;

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

    .line 1393
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtension(Lcom/google/protobuf/ExtensionLite;I)Ljava/lang/Object;

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

    .line 1364
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtensionCount(Lcom/google/protobuf/ExtensionLite;)I

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

    .line 1250
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v1

    .line 1252
    invoke-direct {p0, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1253
    invoke-virtual {v1}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v2

    .line 1254
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

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

    .line 1370
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getExtensionCount(Lcom/google/protobuf/ExtensionLite;)I

    move-result v0

    return v0
.end method

.method public getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 3

    .line 1484
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1485
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1486
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->getField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Ljava/lang/Object;

    move-result-object v2

    .line 1487
    if-nez v2, :cond_1

    .line 1488
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_0

    .line 1491
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getMessageType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/DynamicMessage;->getDefaultInstance(Lcom/google/protobuf/Descriptors$Descriptor;)Lcom/google/protobuf/DynamicMessage;

    move-result-object v0

    return-object v0

    .line 1493
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1496
    :cond_1
    return-object v2

    .line 1499
    :cond_2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;
    .locals 1

    .line 1516
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1517
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1518
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->getRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1520
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$Builder;->getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I
    .locals 1

    .line 1505
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1506
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1507
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->getRepeatedFieldCount(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)I

    move-result v0

    return v0

    .line 1509
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I

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

    .line 1352
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->hasExtension(Lcom/google/protobuf/ExtensionLite;)Z

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

    .line 1240
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1242
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1243
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

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

    .line 1358
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->hasExtension(Lcom/google/protobuf/ExtensionLite;)Z

    move-result v0

    return v0
.end method

.method public hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 1

    .line 1526
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1527
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1528
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/FieldSet;->hasField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;)Z

    move-result v0

    return v0

    .line 1530
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

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

    .line 1201
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1202
    return-void
.end method

.method public isInitialized()Z
    .locals 1

    .line 1454
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensionsAreInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final mergeExtensionFields(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)V
    .locals 2

    .line 1590
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1591
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->access$600(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)Lcom/google/protobuf/FieldSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/FieldSet;->mergeFrom(Lcom/google/protobuf/FieldSet;)V

    .line 1592
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1593
    return-void
.end method

.method protected parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1467
    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    .line 1468
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v3

    new-instance v4, Lcom/google/protobuf/MessageReflection$BuilderAdapter;

    invoke-direct {v4, p0}, Lcom/google/protobuf/MessageReflection$BuilderAdapter;-><init>(Lcom/google/protobuf/Message$Builder;)V

    move v5, p4

    .line 1467
    invoke-static/range {v0 .. v5}, Lcom/google/protobuf/MessageReflection;->mergeFieldFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/MessageReflection$MergeTarget;I)Z

    move-result v0

    return v0
.end method

.method public final setExtension(Lcom/google/protobuf/Extension;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1409
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final setExtension(Lcom/google/protobuf/Extension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/Extension<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1398
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1310
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1312
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1313
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1314
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1315
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    .line 1317
    invoke-virtual {v2, p3}, Lcom/google/protobuf/Extension;->singularToReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1315
    invoke-virtual {v0, v3, p2, v1}, Lcom/google/protobuf/FieldSet;->setRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;ILjava/lang/Object;)V

    .line 1318
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1319
    return-object p0
.end method

.method public final setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1296
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v2

    .line 1298
    invoke-direct {p0, v2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyExtensionContainingType(Lcom/google/protobuf/Extension;)V

    .line 1299
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1300
    invoke-virtual {v2}, Lcom/google/protobuf/Extension;->getDescriptor()Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v3

    .line 1301
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v2, p2}, Lcom/google/protobuf/Extension;->toReflectionType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/google/protobuf/FieldSet;->setField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1302
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1303
    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;Ljava/util/List<TType;>;>;ITType;)TBuilderType;"
        }
    .end annotation

    .line 1415
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setExtension(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:Ljava/lang/Object;>(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension<TMessageType;TType;>;TType;)TBuilderType;"
        }
    .end annotation

    .line 1403
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setExtension(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1537
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1538
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1539
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1540
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/FieldSet;->setField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;Ljava/lang/Object;)V

    .line 1541
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1542
    return-object p0

    .line 1544
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)TBuilderType;"
        }
    .end annotation

    .line 1564
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1565
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->verifyContainingType(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 1566
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->ensureExtensionsIsMutable()V

    .line 1567
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->extensions:Lcom/google/protobuf/FieldSet;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/protobuf/FieldSet;->setRepeatedField(Lcom/google/protobuf/FieldSet$FieldDescriptorLite;ILjava/lang/Object;)V

    .line 1568
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->onChanged()V

    .line 1569
    return-object p0

    .line 1571
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1183
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;

    move-result-object v0

    return-object v0
.end method
