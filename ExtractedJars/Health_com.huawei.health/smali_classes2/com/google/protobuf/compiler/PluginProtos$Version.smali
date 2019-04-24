.class public final Lcom/google/protobuf/compiler/PluginProtos$Version;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/compiler/PluginProtos$VersionOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/compiler/PluginProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Version"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

.field public static final MAJOR_FIELD_NUMBER:I = 0x1

.field public static final MINOR_FIELD_NUMBER:I = 0x2

.field public static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$Version;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PATCH_FIELD_NUMBER:I = 0x3

.field public static final SUFFIX_FIELD_NUMBER:I = 0x4

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private major_:I

.field private memoizedIsInitialized:B

.field private minor_:I

.field private patch_:I

.field private volatile suffix_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 872
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    invoke-direct {v0}, Lcom/google/protobuf/compiler/PluginProtos$Version;-><init>()V

    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 880
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$Version$1;

    invoke-direct {v0}, Lcom/google/protobuf/compiler/PluginProtos$Version$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 279
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedIsInitialized:B

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    .line 98
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 109
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;-><init>()V

    .line 110
    if-nez p2, :cond_0

    .line 111
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 113
    :cond_0
    const/4 v2, 0x0

    .line 115
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 117
    const/4 v4, 0x0

    .line 118
    :goto_0
    if-nez v4, :cond_2

    .line 119
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 120
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 122
    :sswitch_0
    const/4 v4, 0x1

    .line 123
    goto :goto_2

    .line 125
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/compiler/PluginProtos$Version;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 127
    const/4 v4, 0x1

    goto :goto_2

    .line 132
    :sswitch_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    .line 133
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    .line 134
    goto :goto_2

    .line 137
    :sswitch_2
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    .line 138
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    .line 139
    goto :goto_2

    .line 142
    :sswitch_3
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    .line 143
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    .line 144
    goto :goto_2

    .line 147
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 148
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    .line 149
    iput-object v6, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 153
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 160
    :cond_2
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 161
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->makeExtensionsImmutable()V

    .line 162
    goto :goto_3

    .line 154
    :catch_0
    move-exception v4

    .line 155
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 156
    :catch_1
    move-exception v4

    .line 157
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 158
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 161
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->makeExtensionsImmutable()V

    throw v7

    .line 163
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/compiler/PluginProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$Version;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 91
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 279
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedIsInitialized:B

    .line 92
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/compiler/PluginProtos$1;)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$Version;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$1002(Lcom/google/protobuf/compiler/PluginProtos$Version;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    return p1
.end method

.method static synthetic access$1100(Lcom/google/protobuf/compiler/PluginProtos$Version;)Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method static synthetic access$400()Z
    .locals 1

    .line 84
    sget-boolean v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$602(Lcom/google/protobuf/compiler/PluginProtos$Version;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    return p1
.end method

.method static synthetic access$702(Lcom/google/protobuf/compiler/PluginProtos$Version;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    return p1
.end method

.method static synthetic access$802(Lcom/google/protobuf/compiler/PluginProtos$Version;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    return p1
.end method

.method static synthetic access$900(Lcom/google/protobuf/compiler/PluginProtos$Version;)Ljava/lang/Object;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$902(Lcom/google/protobuf/compiler/PluginProtos$Version;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    return-object p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1

    .line 876
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 166
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos;->access$000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    .locals 1

    .line 466
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/compiler/PluginProtos$Version;)Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    .locals 1

    .line 469
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$Version;)Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 440
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 441
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 440
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 447
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 448
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 447
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 408
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 414
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 453
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 454
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 453
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 460
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 461
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 460
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 428
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 429
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 428
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 435
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    .line 436
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 435
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 397
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 403
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 418
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 424
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$Version;>;"
        }
    .end annotation

    .line 890
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 333
    if-ne p1, p0, :cond_0

    .line 334
    const/4 v0, 0x1

    return v0

    .line 336
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/compiler/PluginProtos$Version;

    if-nez v0, :cond_1

    .line 337
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 339
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/compiler/PluginProtos$Version;

    .line 341
    const/4 v3, 0x1

    .line 342
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMajor()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMajor()Z

    move-result v1

    if-ne v0, v1, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 343
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMajor()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 344
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMajor()I

    move-result v0

    .line 345
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMajor()I

    move-result v1

    if-ne v0, v1, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 347
    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMinor()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMinor()Z

    move-result v1

    if-ne v0, v1, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 348
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMinor()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 349
    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMinor()I

    move-result v0

    .line 350
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMinor()I

    move-result v1

    if-ne v0, v1, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    .line 352
    :cond_7
    :goto_3
    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasPatch()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasPatch()Z

    move-result v1

    if-ne v0, v1, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    .line 353
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasPatch()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 354
    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getPatch()I

    move-result v0

    .line 355
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getPatch()I

    move-result v1

    if-ne v0, v1, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    .line 357
    :cond_a
    :goto_5
    if-eqz v3, :cond_b

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasSuffix()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasSuffix()Z

    move-result v1

    if-ne v0, v1, :cond_b

    const/4 v3, 0x1

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    .line 358
    :goto_6
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasSuffix()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 359
    if-eqz v3, :cond_c

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getSuffix()Ljava/lang/String;

    move-result-object v0

    .line 360
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getSuffix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v3, 0x1

    goto :goto_7

    :cond_c
    const/4 v3, 0x0

    .line 362
    :cond_d
    :goto_7
    if-eqz v3, :cond_e

    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v3, 0x1

    goto :goto_8

    :cond_e
    const/4 v3, 0x0

    .line 363
    :goto_8
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$Version;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$Version;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$Version;
    .locals 1

    .line 899
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    return-object v0
.end method

.method public getMajor()I
    .locals 1

    .line 189
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    return v0
.end method

.method public getMinor()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$Version;>;"
        }
    .end annotation

    .line 895
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getPatch()I
    .locals 1

    .line 219
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    return v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 307
    iget v2, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedSize:I

    .line 308
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 310
    :cond_0
    const/4 v2, 0x0

    .line 311
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 312
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    .line 313
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 315
    :cond_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 316
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    .line 317
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 319
    :cond_2
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 320
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    .line 321
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 323
    :cond_3
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 324
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 326
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 327
    iput v2, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedSize:I

    .line 328
    return v2
.end method

.method public getSuffix()Ljava/lang/String;
    .locals 4

    .line 244
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    .line 245
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 246
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 248
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 250
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 251
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    iput-object v3, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    .line 254
    :cond_1
    return-object v3
.end method

.method public getSuffixBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 267
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    .line 268
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 269
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 270
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 272
    iput-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    .line 273
    return-object v2

    .line 275
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasMajor()Z
    .locals 2

    .line 183
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

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

.method public hasMinor()Z
    .locals 2

    .line 198
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

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

.method public hasPatch()Z
    .locals 2

    .line 213
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

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

.method public hasSuffix()Z
    .locals 2

    .line 233
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

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

.method public hashCode()I
    .locals 3

    .line 368
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 369
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedHashCode:I

    return v0

    .line 371
    :cond_0
    const/16 v2, 0x29

    .line 372
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 373
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMajor()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 375
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMajor()I

    move-result v1

    add-int v2, v0, v1

    .line 377
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasMinor()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x2

    .line 379
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getMinor()I

    move-result v1

    add-int v2, v0, v1

    .line 381
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasPatch()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 382
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x3

    .line 383
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getPatch()I

    move-result v1

    add-int v2, v0, v1

    .line 385
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->hasSuffix()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 386
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x4

    .line 387
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->getSuffix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 389
    :cond_4
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 390
    iput v2, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedHashCode:I

    .line 391
    return v2
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 171
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos;->access$100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/google/protobuf/compiler/PluginProtos$Version;

    const-class v2, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    .line 172
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 171
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 281
    iget-byte v1, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedIsInitialized:B

    .line 282
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 283
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 285
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->memoizedIsInitialized:B

    .line 286
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 84
    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$Version;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    .locals 1

    .line 464
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$Version;->newBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    .locals 2

    .line 479
    new-instance v1, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/compiler/PluginProtos$1;)V

    .line 480
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$Version;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;
    .locals 2

    .line 472
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$Version;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$Version;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;-><init>(Lcom/google/protobuf/compiler/PluginProtos$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;-><init>(Lcom/google/protobuf/compiler/PluginProtos$1;)V

    .line 473
    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$Version;)Lcom/google/protobuf/compiler/PluginProtos$Version$Builder;

    move-result-object v0

    .line 472
    :goto_0
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 291
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 292
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->major_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 294
    :cond_0
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 295
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->minor_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 297
    :cond_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 298
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->patch_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 300
    :cond_2
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 301
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->suffix_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 303
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$Version;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 304
    return-void
.end method
