.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private dir_:Ljava/lang/Object;

.field private durationPerPoint_:I

.field private timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;>;"
        }
    .end annotation
.end field

.field private timeSliceList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation
.end field

.field private webUrl_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 26714
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 26877
    .line 26878
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 27123
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27199
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 26715
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->maybeForceBuilderInitialization()V

    .line 26716
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 26720
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 26877
    .line 26878
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 27123
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27199
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 26721
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->maybeForceBuilderInitialization()V

    .line 26722
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 26697
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$36600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26697
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26729
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;-><init>()V

    return-object v0
.end method

.method private ensureTimeSliceListIsMutable()V
    .locals 2

    .line 26880
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 26881
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 26882
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26884
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 26703
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$36300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;>;"
        }
    .end annotation

    .line 27111
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 27112
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 27116
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 27117
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27118
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 27120
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 26724
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$36800()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26725
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26727
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllTimeSliceList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;"
        }
    .end annotation

    .line 27019
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27020
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 27021
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 27023
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 27025
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27027
    :goto_0
    return-object p0
.end method

.method public addTimeSliceList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27005
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27006
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 27007
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 27008
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 27010
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27012
    :goto_0
    return-object p0
.end method

.method public addTimeSliceList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26974
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 26975
    if-nez p2, :cond_0

    .line 26976
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 26978
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26979
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 26980
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 26982
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26984
    :goto_0
    return-object p0
.end method

.method public addTimeSliceList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26991
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 26992
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26993
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26994
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 26996
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26998
    :goto_0
    return-object p0
.end method

.method public addTimeSliceList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26957
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 26958
    if-nez p1, :cond_0

    .line 26959
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 26961
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 26965
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26967
    :goto_0
    return-object p0
.end method

.method public addTimeSliceListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 27090
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 27091
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    .line 27090
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    return-object v0
.end method

.method public addTimeSliceListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 27098
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 27099
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    .line 27098
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 2

    .line 26763
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v1

    .line 26764
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 26765
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 26767
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 5

    .line 26771
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 26772
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26773
    const/4 v4, 0x0

    .line 26774
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 26775
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 26776
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 26777
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26779
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 26781
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/util/List;)Ljava/util/List;

    .line 26783
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 26784
    const/4 v4, 0x1

    .line 26786
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26787
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 26788
    or-int/lit8 v4, v4, 0x2

    .line 26790
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26791
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 26792
    or-int/lit8 v4, v4, 0x4

    .line 26794
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->durationPerPoint_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;I)I

    .line 26795
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;I)I

    .line 26796
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onBuilt()V

    .line 26797
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26733
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 26734
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 26735
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 26736
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    goto :goto_0

    .line 26738
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 26740
    :goto_0
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 26741
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26742
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 26743
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26744
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->durationPerPoint_:I

    .line 26745
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26746
    return-object p0
.end method

.method public clearDir()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27256
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27257
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDir()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27258
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27259
    return-object p0
.end method

.method public clearDurationPerPoint()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27301
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27302
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->durationPerPoint_:I

    .line 27303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27304
    return-object p0
.end method

.method public clearTimeSliceList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27033
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27034
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 27035
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27036
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 27038
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 27040
    :goto_0
    return-object p0
.end method

.method public clearWebUrl()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27180
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27181
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getWebUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27182
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27183
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26750
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

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

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 26697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1

    .line 26759
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 26755
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$36300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDir()Ljava/lang/String;
    .locals 4

    .line 27210
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27211
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 27212
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 27214
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 27215
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27216
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27218
    :cond_0
    return-object v3

    .line 27220
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDirBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 27228
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27229
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27230
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 27231
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 27233
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27234
    return-object v2

    .line 27236
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getDurationPerPoint()I
    .locals 1

    .line 27286
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->durationPerPoint_:I

    return v0
.end method

.method public getTimeSliceList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1

    .line 26913
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 26914
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 26915
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 26917
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0

    .line 26919
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public getTimeSliceListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 27060
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    return-object v0
.end method

.method public getTimeSliceListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;>;"
        }
    .end annotation

    .line 27106
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTimeSliceListCount()I
    .locals 1

    .line 26903
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 26904
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 26906
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getTimeSliceListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation

    .line 26893
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 26894
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 26896
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTimeSliceListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;
    .locals 1

    .line 27067
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 27068
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 27069
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 27071
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;

    return-object v0

    .line 27072
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;

    return-object v0
.end method

.method public getTimeSliceListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;>;"
        }
    .end annotation

    .line 27080
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 27081
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 27083
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getWebUrl()Ljava/lang/String;
    .locals 4

    .line 27134
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27135
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 27136
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 27138
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 27139
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27140
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27142
    :cond_0
    return-object v3

    .line 27144
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getWebUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 27152
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27153
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27154
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 27155
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 27157
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27158
    return-object v2

    .line 27160
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasDir()Z
    .locals 2

    .line 27204
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasDurationPerPoint()Z
    .locals 2

    .line 27280
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasWebUrl()Z
    .locals 2

    .line 27128
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 26708
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$36400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    .line 26709
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 26708
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 26855
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

    .line 26697
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

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

    .line 26697
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

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

    .line 26697
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26697
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

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

    .line 26697
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26862
    const/4 v1, 0x0

    .line 26864
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$32900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 26869
    if-eqz v1, :cond_1

    .line 26870
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    goto :goto_0

    .line 26865
    :catch_0
    move-exception v2

    .line 26866
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-object v1, v0

    .line 26867
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26869
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 26870
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    .line 26872
    :cond_0
    throw v3

    .line 26873
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26801
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    if-eqz v0, :cond_0

    .line 26802
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0

    .line 26804
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 26805
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26810
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 26811
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 26812
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 26813
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26814
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 26815
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    goto :goto_0

    .line 26817
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26818
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 26820
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_2

    .line 26823
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 26824
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 26825
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 26826
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26827
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    .line 26828
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26829
    .line 26830
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37500()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 26831
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->getTimeSliceListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 26833
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26837
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->hasWebUrl()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 26838
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26839
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 26840
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 26842
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->hasDir()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 26843
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 26844
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$37200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 26845
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 26847
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->hasDurationPerPoint()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 26848
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDurationPerPoint()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->setDurationPerPoint(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    .line 26850
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 26851
    return-object p0
.end method

.method public removeTimeSliceList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 27046
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27047
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 27048
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 27049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 27051
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 27053
    :goto_0
    return-object p0
.end method

.method public setDir(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27244
    if-nez p1, :cond_0

    .line 27245
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27247
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27248
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27249
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27250
    return-object p0
.end method

.method public setDirBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27266
    if-nez p1, :cond_0

    .line 27267
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27269
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27270
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->dir_:Ljava/lang/Object;

    .line 27271
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27272
    return-object p0
.end method

.method public setDurationPerPoint(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27292
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27293
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->durationPerPoint_:I

    .line 27294
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27295
    return-object p0
.end method

.method public setTimeSliceList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26944
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 26945
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26946
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 26947
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 26949
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26951
    :goto_0
    return-object p0
.end method

.method public setTimeSliceList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26927
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 26928
    if-nez p2, :cond_0

    .line 26929
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 26931
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->ensureTimeSliceListIsMutable()V

    .line 26932
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 26933
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    goto :goto_0

    .line 26935
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->timeSliceListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 26937
    :goto_0
    return-object p0
.end method

.method public setWebUrl(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27168
    if-nez p1, :cond_0

    .line 27169
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27171
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27172
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27173
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27174
    return-object p0
.end method

.method public setWebUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 27190
    if-nez p1, :cond_0

    .line 27191
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27193
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->bitField0_:I

    .line 27194
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->webUrl_:Ljava/lang/Object;

    .line 27195
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->onChanged()V

    .line 27196
    return-object p0
.end method
