.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HealthData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    }
.end annotation


# static fields
.field public static final APP_FIELD_NUMBER:I = 0x5

.field public static final DEVICE_FIELD_NUMBER:I = 0x4

.field public static final ENDTIME_FIELD_NUMBER:I = 0x9

.field private static HEALTHDATAPARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;>;"
        }
    .end annotation
.end field

.field public static final HUID_FIELD_NUMBER:I = 0x1

.field public static final LOCATION_FIELD_NUMBER:I = 0xa

.field public static final RECORDID_FIELD_NUMBER:I = 0x6

.field public static final STARTTIME_FIELD_NUMBER:I = 0x8

.field public static final SUBTYPE_FIELD_NUMBER:I = 0x3

.field public static final TIMEZONE_FIELD_NUMBER:I = 0x7

.field public static final TYPE_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

.field private bitField0:I

.field private deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

.field private endTime:J

.field private huid:J

.field private isMemoizedInitialized:B

.field private location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

.field private memoizedSerializedSize:I

.field private recordId:Ljava/lang/Object;

.field private startTime:J

.field private subType:I

.field private timeZone:Ljava/lang/Object;

.field private type:I

.field private final unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 278
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    .line 1594
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 1595
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->initFields()V

    .line 1596
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 158
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 529
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isMemoizedInitialized:B

    .line 575
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->memoizedSerializedSize:I

    .line 159
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->initFields()V

    .line 161
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v2

    .line 163
    const/4 v3, 0x0

    .line 164
    :goto_0
    if-nez v3, :cond_7

    .line 165
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v4

    .line 166
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 168
    :sswitch_0
    const/4 v3, 0x1

    .line 169
    goto/16 :goto_2

    .line 172
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 173
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    .line 174
    goto/16 :goto_2

    .line 177
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 178
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    .line 179
    goto/16 :goto_2

    .line 182
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 183
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    .line 184
    goto/16 :goto_2

    .line 187
    :sswitch_4
    const/4 v5, 0x0

    .line 188
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v5

    .line 191
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$000()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 192
    if-eqz v5, :cond_1

    .line 193
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 194
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 196
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 197
    goto/16 :goto_2

    .line 200
    :sswitch_5
    const/4 v5, 0x0

    .line 201
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    .line 202
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v5

    .line 204
    :cond_2
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 205
    if-eqz v5, :cond_3

    .line 206
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 207
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 209
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 210
    goto/16 :goto_2

    .line 213
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v5

    .line 214
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 215
    iput-object v5, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 216
    goto/16 :goto_2

    .line 219
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v5

    .line 220
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 221
    iput-object v5, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 222
    goto/16 :goto_2

    .line 225
    :sswitch_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 226
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    .line 227
    goto :goto_2

    .line 230
    :sswitch_9
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 231
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    .line 232
    goto :goto_2

    .line 235
    :sswitch_a
    const/4 v5, 0x0

    .line 236
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_4

    .line 237
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v5

    .line 239
    :cond_4
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->access$200()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 240
    if-eqz v5, :cond_5

    .line 241
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 242
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 244
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    .line 245
    goto :goto_2

    .line 248
    :goto_1
    invoke-virtual {p0, p1, v2, p2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_6

    .line 250
    const/4 v3, 0x1

    .line 255
    :cond_6
    :goto_2
    goto/16 :goto_0

    .line 262
    :cond_7
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 263
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->makeExtensionsImmutable()V

    .line 264
    goto :goto_3

    .line 256
    :catch_0
    move-exception v3

    .line 257
    :try_start_1
    invoke-virtual {v3, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 258
    :catch_1
    move-exception v3

    .line 259
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 260
    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    :catchall_0
    move-exception v6

    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 263
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->makeExtensionsImmutable()V

    .line 264
    throw v6

    .line 265
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
        0x40 -> :sswitch_8
        0x48 -> :sswitch_9
        0x52 -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 130
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 136
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 529
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isMemoizedInitialized:B

    .line 575
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->memoizedSerializedSize:I

    .line 137
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 138
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 133
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 529
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isMemoizedInitialized:B

    .line 575
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->memoizedSerializedSize:I

    .line 133
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$1002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J
    .locals 0

    .line 130
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    return-wide p1
.end method

.method static synthetic access$1102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I
    .locals 0

    .line 130
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    return p1
.end method

.method static synthetic access$1202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I
    .locals 0

    .line 130
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    return p1
.end method

.method static synthetic access$1302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object p1
.end method

.method static synthetic access$1402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object p1
.end method

.method static synthetic access$1500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Ljava/lang/Object;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$1502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$1600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Ljava/lang/Object;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$1602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$1702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J
    .locals 0

    .line 130
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    return-wide p1
.end method

.method static synthetic access$1802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;J)J
    .locals 0

    .line 130
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    return-wide p1
.end method

.method static synthetic access$1902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object p1
.end method

.method static synthetic access$2002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;I)I
    .locals 0

    .line 130
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    return p1
.end method

.method static synthetic access$2100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 130
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$800()Z
    .locals 1

    .line 130
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 142
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 268
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 518
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    .line 519
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    .line 520
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    .line 521
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 522
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 523
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 524
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 525
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    .line 526
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    .line 527
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 528
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 686
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->access$600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 689
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 666
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 672
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 636
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 642
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 677
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 683
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 656
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 662
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 646
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 652
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method


# virtual methods
.method public getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public getAppOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 146
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public getDeviceOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 493
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    return-wide v0
.end method

.method public getHuid()J
    .locals 2

    .line 307
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    return-wide v0
.end method

.method public getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1

    .line 508
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public getLocationOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;
    .locals 1

    .line 514
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;>;"
        }
    .end annotation

    .line 290
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->HEALTHDATAPARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 4

    .line 394
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 395
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 396
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 398
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 400
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 401
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 402
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 404
    :cond_1
    return-object v3
.end method

.method public getRecordIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 412
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 413
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 414
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 415
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 417
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->recordId:Ljava/lang/Object;

    .line 418
    return-object v2

    .line 420
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 577
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->memoizedSerializedSize:I

    .line 578
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 580
    :cond_0
    const/4 v3, 0x0

    .line 581
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 582
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    .line 583
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 585
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 586
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    .line 587
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 589
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 590
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    .line 591
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 593
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 594
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 595
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 597
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 598
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 599
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 601
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 602
    .line 603
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getRecordIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 605
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 606
    .line 607
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getTimeZoneBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 609
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 610
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    .line 611
    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 613
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_9

    .line 614
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    .line 615
    const/16 v2, 0x9

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 617
    :cond_9
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_a

    .line 618
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 619
    const/16 v1, 0xa

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 621
    :cond_a
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 622
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->memoizedSerializedSize:I

    .line 623
    return v3
.end method

.method public getStartTime()J
    .locals 2

    .line 478
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    return-wide v0
.end method

.method public getSubType()I
    .locals 1

    .line 337
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 4

    .line 436
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 437
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 438
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 440
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 442
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 443
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 444
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 446
    :cond_1
    return-object v3
.end method

.method public getTimeZoneBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 454
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 455
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 456
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 457
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 459
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->timeZone:Ljava/lang/Object;

    .line 460
    return-object v2

    .line 462
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasApp()Z
    .locals 2

    .line 367
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 346
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 487
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 301
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 502
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 388
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 472
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 331
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 430
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 316
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

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

    .line 273
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 274
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 273
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 531
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isMemoizedInitialized:B

    .line 532
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 533
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 535
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->isMemoizedInitialized:B

    .line 536
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 130
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 687
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 696
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 697
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 1

    .line 691
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 630
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 541
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getSerializedSize()I

    .line 542
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 543
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->huid:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 545
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 546
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->type:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 548
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v1, v0, :cond_2

    .line 549
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->subType:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 551
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_3

    .line 552
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->deviceInfo:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 554
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v1, v0, :cond_4

    .line 555
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->app:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 557
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v1, v0, :cond_5

    .line 558
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getRecordIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 560
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v1, v0, :cond_6

    .line 561
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getTimeZoneBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 563
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v1, v0, :cond_7

    .line 564
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->startTime:J

    const/16 v2, 0x8

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 566
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v1, v0, :cond_8

    .line 567
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->endTime:J

    const/16 v2, 0x9

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 569
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->bitField0:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v1, v0, :cond_9

    .line 570
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->location:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 572
    :cond_9
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 573
    return-void
.end method
