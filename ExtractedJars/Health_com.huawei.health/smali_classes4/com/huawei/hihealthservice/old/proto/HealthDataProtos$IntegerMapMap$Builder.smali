.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;>;"
        }
    .end annotation
.end field

.field private entries_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 20830
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 20960
    .line 20961
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20831
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->maybeForceBuilderInitialization()V

    .line 20832
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 20836
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 20960
    .line 20961
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20837
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->maybeForceBuilderInitialization()V

    .line 20838
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 20813
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$28700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20813
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20845
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;-><init>()V

    return-object v0
.end method

.method private ensureEntriesIsMutable()V
    .locals 2

    .line 20963
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 20964
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20965
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    .line 20967
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 20819
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$28400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 21194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21195
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 21199
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 21200
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 21203
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 20840
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$28900()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20841
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 20843
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEntries(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;"
        }
    .end annotation

    .line 21102
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21103
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21104
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 21106
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21108
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21110
    :goto_0
    return-object p0
.end method

.method public addEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 21088
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21089
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21090
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21091
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21093
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21095
    :goto_0
    return-object p0
.end method

.method public addEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 21057
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21058
    if-nez p2, :cond_0

    .line 21059
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21061
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21062
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21063
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21065
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21067
    :goto_0
    return-object p0
.end method

.method public addEntries(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 21074
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21075
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21076
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21077
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21079
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21081
    :goto_0
    return-object p0
.end method

.method public addEntries(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 21040
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21041
    if-nez p1, :cond_0

    .line 21042
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21044
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21045
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21046
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21048
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21050
    :goto_0
    return-object p0
.end method

.method public addEntriesBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 21173
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 21174
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    .line 21173
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    return-object v0
.end method

.method public addEntriesBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 21181
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 21182
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    .line 21181
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 2

    .line 20873
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v1

    .line 20874
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 20875
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 20877
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 4

    .line 20881
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 20882
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    .line 20883
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 20884
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 20885
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20886
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    .line 20888
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 20890
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;Ljava/util/List;)Ljava/util/List;

    .line 20892
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onBuilt()V

    .line 20893
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 20849
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 20850
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 20851
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20852
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    goto :goto_0

    .line 20854
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 20856
    :goto_0
    return-object p0
.end method

.method public clearEntries()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 21116
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21117
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 21118
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    .line 21119
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21121
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 21123
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 20860
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

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

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 20813
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1

    .line 20869
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 20865
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$28400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1

    .line 20996
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 20997
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 20998
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21000
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0

    .line 21002
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public getEntriesBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 21143
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    return-object v0
.end method

.method public getEntriesBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;>;"
        }
    .end annotation

    .line 21189
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEntriesCount()I
    .locals 1

    .line 20986
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 20987
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 20989
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getEntriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation

    .line 20976
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 20977
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 20979
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEntriesOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;
    .locals 1

    .line 21150
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 21151
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 21152
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21154
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;

    return-object v0

    .line 21155
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;

    return-object v0
.end method

.method public getEntriesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 21163
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 21164
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 21166
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 20824
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$28500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    .line 20825
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 20824
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 20938
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

    .line 20813
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

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

    .line 20813
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

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

    .line 20813
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20813
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

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

    .line 20813
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20945
    const/4 v1, 0x0

    .line 20947
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$26600()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 20952
    if-eqz v1, :cond_1

    .line 20953
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    goto :goto_0

    .line 20948
    :catch_0
    move-exception v2

    .line 20949
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-object v1, v0

    .line 20950
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20952
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 20953
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    .line 20955
    :cond_0
    throw v3

    .line 20956
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20897
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    if-eqz v0, :cond_0

    .line 20898
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0

    .line 20900
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 20901
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 20906
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 20907
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 20908
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 20909
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20910
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20911
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    goto :goto_0

    .line 20913
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 20914
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 20916
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_2

    .line 20919
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 20920
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 20921
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 20922
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 20923
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    .line 20924
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->bitField0_:I

    .line 20925
    .line 20926
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29200()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 20927
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 20929
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 20933
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 20934
    return-object p0
.end method

.method public removeEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 21129
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21130
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21131
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 21132
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21134
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 21136
    :goto_0
    return-object p0
.end method

.method public setEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 21027
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21028
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21029
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21030
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21032
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21034
    :goto_0
    return-object p0
.end method

.method public setEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 21010
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21011
    if-nez p2, :cond_0

    .line 21012
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21014
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21015
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21016
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21018
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21020
    :goto_0
    return-object p0
.end method
