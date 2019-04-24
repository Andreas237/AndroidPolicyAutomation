.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;"
    }
.end annotation


# instance fields
.field private appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;>;"
        }
    .end annotation
.end field

.field private app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

.field private bitField0_:I

.field private deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;>;"
        }
    .end annotation
.end field

.field private device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

.field private endTime_:J

.field private huid_:J

.field private locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;>;"
        }
    .end annotation
.end field

.field private location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

.field private recordId_:Ljava/lang/Object;

.field private startTime_:J

.field private subType_:I

.field private timeZone_:Ljava/lang/Object;

.field private type_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 719
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 1026
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1142
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1258
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1334
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1474
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 720
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->maybeForceBuilderInitialization()V

    .line 721
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 725
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 1026
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1142
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1258
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1334
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1474
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 726
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->maybeForceBuilderInitialization()V

    .line 727
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 702
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 702
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 736
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;-><init>()V

    return-object v0
.end method

.method private getAppFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;>;"
        }
    .end annotation

    .line 1247
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1248
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 1250
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v1

    .line 1251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 1252
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 1253
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1255
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 708
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getDeviceFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;>;"
        }
    .end annotation

    .line 1131
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1132
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 1134
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v1

    .line 1135
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 1136
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 1137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1139
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private getLocationFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;>;"
        }
    .end annotation

    .line 1579
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1580
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 1582
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v1

    .line 1583
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 1584
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 1585
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1587
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 729
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$800()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 730
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDeviceFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 731
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getAppFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 732
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getLocationFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 734
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 2

    .line 790
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 791
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 792
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 794
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 5

    .line 798
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 799
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 800
    const/4 v4, 0x0

    .line 801
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 802
    const/4 v4, 0x1

    .line 804
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->huid_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J

    .line 805
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 806
    or-int/lit8 v4, v4, 0x2

    .line 808
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->type_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I

    .line 809
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v1, v0, :cond_2

    .line 810
    or-int/lit8 v4, v4, 0x4

    .line 812
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->subType_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I

    .line 813
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_3

    .line 814
    or-int/lit8 v4, v4, 0x8

    .line 816
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_4

    .line 817
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    goto :goto_0

    .line 819
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 821
    :goto_0
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v1, v0, :cond_5

    .line 822
    or-int/lit8 v4, v4, 0x10

    .line 824
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_6

    .line 825
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    goto :goto_1

    .line 827
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 829
    :goto_1
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v1, v0, :cond_7

    .line 830
    or-int/lit8 v4, v4, 0x20

    .line 832
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v1, v0, :cond_8

    .line 834
    or-int/lit8 v4, v4, 0x40

    .line 836
    :cond_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v1, v0, :cond_9

    .line 838
    or-int/lit16 v4, v4, 0x80

    .line 840
    :cond_9
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->startTime_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J

    .line 841
    and-int/lit16 v0, v3, 0x100

    const/16 v1, 0x100

    if-ne v1, v0, :cond_a

    .line 842
    or-int/lit16 v4, v4, 0x100

    .line 844
    :cond_a
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->endTime_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J

    .line 845
    and-int/lit16 v0, v3, 0x200

    const/16 v1, 0x200

    if-ne v1, v0, :cond_b

    .line 846
    or-int/lit16 v4, v4, 0x200

    .line 848
    :cond_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_c

    .line 849
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    goto :goto_2

    .line 851
    :cond_c
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 853
    :goto_2
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I

    .line 854
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onBuilt()V

    .line 855
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 740
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 741
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->huid_:J

    .line 742
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 743
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->type_:I

    .line 744
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 745
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->subType_:I

    .line 746
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 747
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 748
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    goto :goto_0

    .line 750
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 752
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 753
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 754
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    goto :goto_1

    .line 756
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 758
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 759
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 760
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 761
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 762
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 763
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->startTime_:J

    .line 764
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 765
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->endTime_:J

    .line 766
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 767
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_2

    .line 768
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    goto :goto_2

    .line 770
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 772
    :goto_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 773
    return-object p0
.end method

.method public clearApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1214
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1215
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1216
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1218
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 1220
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1221
    return-object p0
.end method

.method public clearDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1098
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1099
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1100
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1102
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 1104
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1105
    return-object p0
.end method

.method public clearEndTime()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1468
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1469
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->endTime_:J

    .line 1470
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1471
    return-object p0
.end method

.method public clearHuid()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 956
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 957
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->huid_:J

    .line 958
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 959
    return-object p0
.end method

.method public clearLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1546
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1547
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1548
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1550
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 1552
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1553
    return-object p0
.end method

.method public clearRecordId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1315
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1316
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getRecordId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1317
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1318
    return-object p0
.end method

.method public clearStartTime()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1436
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1437
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->startTime_:J

    .line 1438
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1439
    return-object p0
.end method

.method public clearSubType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1020
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1021
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->subType_:I

    .line 1022
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1023
    return-object p0
.end method

.method public clearTimeZone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1391
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1392
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1393
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1394
    return-object p0
.end method

.method public clearType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 988
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 989
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->type_:I

    .line 990
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 991
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 777
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

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

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1

    .line 1155
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1156
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0

    .line 1158
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public getAppBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 1227
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1228
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1229
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getAppFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    return-object v0
.end method

.method public getAppOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;
    .locals 1

    .line 1235
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 1236
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;

    return-object v0

    .line 1238
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 786
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 782
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1

    .line 1039
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1040
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0

    .line 1042
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public getDeviceBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 1111
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1112
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1113
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDeviceFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    return-object v0
.end method

.method public getDeviceOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;
    .locals 1

    .line 1119
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;

    return-object v0

    .line 1122
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 1453
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->endTime_:J

    return-wide v0
.end method

.method public getHuid()J
    .locals 2

    .line 941
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->huid_:J

    return-wide v0
.end method

.method public getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1

    .line 1487
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1488
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0

    .line 1490
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public getLocationBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 1559
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1561
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getLocationFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    return-object v0
.end method

.method public getLocationOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;
    .locals 1

    .line 1567
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 1568
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;

    return-object v0

    .line 1570
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 4

    .line 1269
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1270
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1271
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 1273
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 1274
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1275
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1277
    :cond_0
    return-object v3

    .line 1279
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRecordIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 1287
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1288
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1289
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 1290
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 1292
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1293
    return-object v2

    .line 1295
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1421
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->startTime_:J

    return-wide v0
.end method

.method public getSubType()I
    .locals 1

    .line 1005
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->subType_:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 4

    .line 1345
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1346
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1347
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 1349
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 1350
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1351
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1353
    :cond_0
    return-object v3

    .line 1355
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTimeZoneBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 1363
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1364
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1365
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 1366
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 1368
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1369
    return-object v2

    .line 1371
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 973
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->type_:I

    return v0
.end method

.method public hasApp()Z
    .locals 2

    .line 1149
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasDevice()Z
    .locals 2

    .line 1033
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

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

.method public hasEndTime()Z
    .locals 2

    .line 1447
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasHuid()Z
    .locals 2

    .line 935
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLocation()Z
    .locals 2

    .line 1481
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasRecordId()Z
    .locals 2

    .line 1263
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasStartTime()Z
    .locals 2

    .line 1415
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasSubType()Z
    .locals 2

    .line 999
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

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

.method public hasTimeZone()Z
    .locals 2

    .line 1339
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 967
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

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

    .line 713
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 714
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 713
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 908
    const/4 v0, 0x1

    return v0
.end method

.method public mergeApp(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1195
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1196
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1197
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1198
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1199
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    goto :goto_0

    .line 1201
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1203
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_1

    .line 1205
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1207
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1208
    return-object p0
.end method

.method public mergeDevice(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1079
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1080
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1081
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1082
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1083
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    goto :goto_0

    .line 1085
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1087
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_1

    .line 1089
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1091
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1092
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 702
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

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

    .line 702
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

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

    .line 702
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

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

    .line 702
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 915
    const/4 v1, 0x0

    .line 917
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 922
    if-eqz v1, :cond_1

    .line 923
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    goto :goto_0

    .line 918
    :catch_0
    move-exception v2

    .line 919
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-object v1, v0

    .line 920
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 922
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 923
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 925
    :cond_0
    throw v3

    .line 926
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 859
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    if-eqz v0, :cond_0

    .line 860
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0

    .line 862
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 863
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 868
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 869
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 870
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getHuid()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 872
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasType()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 873
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 875
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasSubType()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 876
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getSubType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setSubType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 878
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasDevice()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 879
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeDevice(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 881
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasApp()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 882
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeApp(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 884
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasRecordId()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 885
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 886
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 887
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 889
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasTimeZone()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 890
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 891
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$1600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 892
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 894
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasStartTime()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 895
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setStartTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 897
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasEndTime()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 898
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setEndTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 900
    :cond_9
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasLocation()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 901
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 903
    :cond_a
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 904
    return-object p0
.end method

.method public mergeLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1527
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1528
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1529
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1530
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1531
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    goto :goto_0

    .line 1533
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1535
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_1

    .line 1537
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1539
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1540
    return-object p0
.end method

.method public setApp(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1182
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1183
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1184
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1186
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1188
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1189
    return-object p0
.end method

.method public setApp(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1165
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1166
    if-nez p1, :cond_0

    .line 1167
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1169
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->app_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 1170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1172
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->appBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1174
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1175
    return-object p0
.end method

.method public setDevice(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1066
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1067
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1068
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1070
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1072
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1073
    return-object p0
.end method

.method public setDevice(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1049
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1050
    if-nez p1, :cond_0

    .line 1051
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1053
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->device_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 1054
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1056
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->deviceBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1058
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1059
    return-object p0
.end method

.method public setEndTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1459
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1460
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->endTime_:J

    .line 1461
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1462
    return-object p0
.end method

.method public setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 947
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 948
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->huid_:J

    .line 949
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 950
    return-object p0
.end method

.method public setLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1514
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 1515
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1516
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1518
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1520
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1521
    return-object p0
.end method

.method public setLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1497
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 1498
    if-nez p1, :cond_0

    .line 1499
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1501
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->location_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 1502
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    goto :goto_0

    .line 1504
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->locationBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 1506
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1507
    return-object p0
.end method

.method public setRecordId(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1303
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1304
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1306
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1308
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1309
    return-object p0
.end method

.method public setRecordIdBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1325
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1326
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1328
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1329
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->recordId_:Ljava/lang/Object;

    .line 1330
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1331
    return-object p0
.end method

.method public setStartTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1427
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1428
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->startTime_:J

    .line 1429
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1430
    return-object p0
.end method

.method public setSubType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1011
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1012
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->subType_:I

    .line 1013
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1014
    return-object p0
.end method

.method public setTimeZone(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1379
    if-nez p1, :cond_0

    .line 1380
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1382
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1383
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1384
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1385
    return-object p0
.end method

.method public setTimeZoneBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 1401
    if-nez p1, :cond_0

    .line 1402
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1404
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 1405
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->timeZone_:Ljava/lang/Object;

    .line 1406
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 1407
    return-object p0
.end method

.method public setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 979
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->bitField0_:I

    .line 980
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->type_:I

    .line 981
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->onChanged()V

    .line 982
    return-object p0
.end method
