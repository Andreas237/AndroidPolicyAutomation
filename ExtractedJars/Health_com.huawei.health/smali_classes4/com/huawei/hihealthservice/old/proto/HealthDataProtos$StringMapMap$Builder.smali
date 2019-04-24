.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;>;"
        }
    .end annotation
.end field

.field private entries_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 21517
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 21647
    .line 21648
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21518
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->maybeForceBuilderInitialization()V

    .line 21519
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 21523
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 21647
    .line 21648
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21524
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->maybeForceBuilderInitialization()V

    .line 21525
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 21500
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$29600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21500
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21532
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;-><init>()V

    return-object v0
.end method

.method private ensureEntriesIsMutable()V
    .locals 2

    .line 21650
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 21651
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21652
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    .line 21654
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 21506
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$29300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 21881
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21882
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 21886
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 21887
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21888
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21890
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 21527
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$29800()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21528
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21530
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEntries(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;"
        }
    .end annotation

    .line 21789
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21790
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21791
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 21793
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21795
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21797
    :goto_0
    return-object p0
.end method

.method public addEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21775
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21776
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21777
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21778
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21780
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21782
    :goto_0
    return-object p0
.end method

.method public addEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21744
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21745
    if-nez p2, :cond_0

    .line 21746
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21748
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21749
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21750
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21752
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21754
    :goto_0
    return-object p0
.end method

.method public addEntries(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21761
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21762
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21763
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21764
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21766
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21768
    :goto_0
    return-object p0
.end method

.method public addEntries(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21727
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21728
    if-nez p1, :cond_0

    .line 21729
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21731
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21732
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21733
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21735
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21737
    :goto_0
    return-object p0
.end method

.method public addEntriesBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 21860
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 21861
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    .line 21860
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    return-object v0
.end method

.method public addEntriesBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 21868
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 21869
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    .line 21868
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 2

    .line 21560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v1

    .line 21561
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21562
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 21564
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 4

    .line 21568
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 21569
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    .line 21570
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21571
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 21572
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21573
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    .line 21575
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 21577
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;Ljava/util/List;)Ljava/util/List;

    .line 21579
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onBuilt()V

    .line 21580
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21536
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 21537
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21538
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21539
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    goto :goto_0

    .line 21541
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 21543
    :goto_0
    return-object p0
.end method

.method public clearEntries()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21803
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21804
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21805
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    .line 21806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21808
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 21810
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21547
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

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

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 21500
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1

    .line 21556
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 21552
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$29300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1

    .line 21683
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 21684
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 21685
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21687
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0

    .line 21689
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public getEntriesBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 21830
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    return-object v0
.end method

.method public getEntriesBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;>;"
        }
    .end annotation

    .line 21876
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEntriesCount()I
    .locals 1

    .line 21673
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21674
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 21676
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getEntriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation

    .line 21663
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21664
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 21666
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEntriesOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;
    .locals 1

    .line 21837
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 21838
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 21839
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21841
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;

    return-object v0

    .line 21842
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;

    return-object v0
.end method

.method public getEntriesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 21850
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 21851
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 21853
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 21511
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$29400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    .line 21512
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 21511
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 21625
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

    .line 21500
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

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

    .line 21500
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

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

    .line 21500
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21500
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

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

    .line 21500
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21632
    const/4 v1, 0x0

    .line 21634
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$26500()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 21639
    if-eqz v1, :cond_1

    .line 21640
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    goto :goto_0

    .line 21635
    :catch_0
    move-exception v2

    .line 21636
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-object v1, v0

    .line 21637
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21639
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 21640
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    .line 21642
    :cond_0
    throw v3

    .line 21643
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21584
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    if-eqz v0, :cond_0

    .line 21585
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0

    .line 21587
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 21588
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21593
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 21594
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 21595
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 21596
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21597
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21598
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    goto :goto_0

    .line 21600
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21601
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 21603
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_2

    .line 21606
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 21607
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 21608
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 21609
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21610
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    .line 21611
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->bitField0_:I

    .line 21612
    .line 21613
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30100()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 21614
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->getEntriesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 21616
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21620
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 21621
    return-object p0
.end method

.method public removeEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21816
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21817
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21818
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 21819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21821
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 21823
    :goto_0
    return-object p0
.end method

.method public setEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21714
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 21715
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21716
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21717
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21719
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21721
    :goto_0
    return-object p0
.end method

.method public setEntries(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21697
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 21698
    if-nez p2, :cond_0

    .line 21699
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 21701
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->ensureEntriesIsMutable()V

    .line 21702
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entries_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21703
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->onChanged()V

    goto :goto_0

    .line 21705
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->entriesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 21707
    :goto_0
    return-object p0
.end method
