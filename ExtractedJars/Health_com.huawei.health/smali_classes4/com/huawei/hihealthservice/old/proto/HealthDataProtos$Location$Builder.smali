.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;"
    }
.end annotation


# instance fields
.field private altitude_:D

.field private bitField0_:I

.field private latitude_:D

.field private longitude_:D

.field private name_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2000
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 2224
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2001
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->maybeForceBuilderInitialization()V

    .line 2002
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 2006
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 2224
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2007
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->maybeForceBuilderInitialization()V

    .line 2008
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 1983
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$2500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 1983
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 2014
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1989
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$2200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 2010
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$2700()Z

    move-result v0

    .line 2012
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 2

    .line 2044
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v1

    .line 2045
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2046
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 2048
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 5

    .line 2052
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 2053
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2054
    const/4 v4, 0x0

    .line 2055
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2056
    const/4 v4, 0x1

    .line 2058
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->longitude_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$2902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D

    .line 2059
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2060
    or-int/lit8 v4, v4, 0x2

    .line 2062
    :cond_1
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->latitude_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$3002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D

    .line 2063
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 2064
    or-int/lit8 v4, v4, 0x4

    .line 2066
    :cond_2
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->altitude_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$3102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D

    .line 2067
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 2068
    or-int/lit8 v4, v4, 0x8

    .line 2070
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$3202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2071
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$3302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;I)I

    .line 2072
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onBuilt()V

    .line 2073
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2018
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 2019
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->longitude_:D

    .line 2020
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2021
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->latitude_:D

    .line 2022
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2023
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->altitude_:D

    .line 2024
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2025
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2026
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2027
    return-object p0
.end method

.method public clearAltitude()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2218
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2219
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->altitude_:D

    .line 2220
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2221
    return-object p0
.end method

.method public clearLatitude()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2186
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2187
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->latitude_:D

    .line 2188
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2189
    return-object p0
.end method

.method public clearLongitude()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2154
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2155
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->longitude_:D

    .line 2156
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2157
    return-object p0
.end method

.method public clearName()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2281
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2282
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2283
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2284
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2031
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

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

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAltitude()D
    .locals 2

    .line 2203
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->altitude_:D

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 1983
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1

    .line 2040
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2036
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$2200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .line 2171
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->latitude_:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 2139
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->longitude_:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 2235
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2236
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 2237
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 2239
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 2240
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2241
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2243
    :cond_0
    return-object v3

    .line 2245
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 2253
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2254
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2255
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 2256
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 2258
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2259
    return-object v2

    .line 2261
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasAltitude()Z
    .locals 2

    .line 2197
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

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

.method public hasLatitude()Z
    .locals 2

    .line 2165
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

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

.method public hasLongitude()Z
    .locals 2

    .line 2133
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

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

.method public hasName()Z
    .locals 2

    .line 2229
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 1994
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$2300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 1995
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 1994
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 2106
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

    .line 1983
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

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

    .line 1983
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

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

    .line 1983
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1983
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

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

    .line 1983
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2113
    const/4 v1, 0x0

    .line 2115
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$200()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 2120
    if-eqz v1, :cond_1

    .line 2121
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    goto :goto_0

    .line 2116
    :catch_0
    move-exception v2

    .line 2117
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-object v1, v0

    .line 2118
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2120
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 2121
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 2123
    :cond_0
    throw v3

    .line 2124
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 2077
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    if-eqz v0, :cond_0

    .line 2078
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0

    .line 2080
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 2081
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2086
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 2087
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasLongitude()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2088
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setLongitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 2090
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasLatitude()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2091
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setLatitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 2093
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasAltitude()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2094
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getAltitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setAltitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 2096
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasName()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2097
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2098
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$3200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2099
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2101
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 2102
    return-object p0
.end method

.method public setAltitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2209
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2210
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->altitude_:D

    .line 2211
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2212
    return-object p0
.end method

.method public setLatitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2177
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2178
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->latitude_:D

    .line 2179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2180
    return-object p0
.end method

.method public setLongitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2145
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2146
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->longitude_:D

    .line 2147
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2148
    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2269
    if-nez p1, :cond_0

    .line 2270
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 2272
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2273
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2274
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2275
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 2291
    if-nez p1, :cond_0

    .line 2292
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 2294
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->bitField0_:I

    .line 2295
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->name_:Ljava/lang/Object;

    .line 2296
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->onChanged()V

    .line 2297
    return-object p0
.end method
