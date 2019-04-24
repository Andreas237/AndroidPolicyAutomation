.class public final Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$FileOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "File"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    }
.end annotation


# static fields
.field public static final CONTENT_FIELD_NUMBER:I = 0xf

.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

.field public static final INSERTION_POINT_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private volatile content_:Ljava/lang/Object;

.field private volatile insertionPoint_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 4531
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    invoke-direct {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;-><init>()V

    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 4539
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$1;

    invoke-direct {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 3252
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 3617
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedIsInitialized:B

    .line 3253
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3254
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3255
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    .line 3256
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3267
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;-><init>()V

    .line 3268
    if-nez p2, :cond_0

    .line 3269
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3271
    :cond_0
    const/4 v2, 0x0

    .line 3273
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 3275
    const/4 v4, 0x0

    .line 3276
    :goto_0
    if-nez v4, :cond_2

    .line 3277
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 3278
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 3280
    :sswitch_0
    const/4 v4, 0x1

    .line 3281
    goto :goto_2

    .line 3283
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3285
    const/4 v4, 0x1

    goto :goto_2

    .line 3290
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3291
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    .line 3292
    iput-object v6, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3293
    goto :goto_2

    .line 3296
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3297
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    .line 3298
    iput-object v6, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3299
    goto :goto_2

    .line 3302
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3303
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    .line 3304
    iput-object v6, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3305
    .line 3308
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 3315
    :cond_2
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 3316
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->makeExtensionsImmutable()V

    .line 3317
    goto :goto_3

    .line 3309
    :catch_0
    move-exception v4

    .line 3310
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 3311
    :catch_1
    move-exception v4

    .line 3312
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 3313
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3315
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 3316
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->makeExtensionsImmutable()V

    throw v7

    .line 3318
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x7a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/compiler/PluginProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3243
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 3250
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 3617
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedIsInitialized:B

    .line 3251
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/compiler/PluginProtos$1;)V
    .locals 0

    .line 3243
    invoke-direct {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$3300()Z
    .locals 1

    .line 3243
    sget-boolean v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$3500(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Ljava/lang/Object;
    .locals 1

    .line 3243
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$3502(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3243
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$3600(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Ljava/lang/Object;
    .locals 1

    .line 3243
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$3602(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3243
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$3700(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Ljava/lang/Object;
    .locals 1

    .line 3243
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$3702(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3243
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$3802(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;I)I
    .locals 0

    .line 3243
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    return p1
.end method

.method static synthetic access$3900(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 3243
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1

    .line 4535
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 3321
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos;->access$2900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    .locals 1

    .line 3786
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    .locals 1

    .line 3789
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3760
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3761
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3760
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3767
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3768
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3767
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3728
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3734
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3773
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3774
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3773
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3780
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3781
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3780
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3748
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3749
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3748
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3755
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    .line 3756
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3755
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3717
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3723
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3738
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3744
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;>;"
        }
    .end annotation

    .line 4549
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 3662
    if-ne p1, p0, :cond_0

    .line 3663
    const/4 v0, 0x1

    return v0

    .line 3665
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    if-nez v0, :cond_1

    .line 3666
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 3668
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 3670
    const/4 v3, 0x1

    .line 3671
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasName()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasName()Z

    move-result v1

    if-ne v0, v1, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 3672
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasName()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3673
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 3674
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 3676
    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasInsertionPoint()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasInsertionPoint()Z

    move-result v1

    if-ne v0, v1, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 3677
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasInsertionPoint()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3678
    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getInsertionPoint()Ljava/lang/String;

    move-result-object v0

    .line 3679
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getInsertionPoint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    .line 3681
    :cond_7
    :goto_3
    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasContent()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasContent()Z

    move-result v1

    if-ne v0, v1, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    .line 3682
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasContent()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3683
    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getContent()Ljava/lang/String;

    move-result-object v0

    .line 3684
    invoke-virtual {v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    .line 3686
    :cond_a
    :goto_5
    if-eqz v3, :cond_b

    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v3, 0x1

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    .line 3687
    :goto_6
    return v3
.end method

.method public getContent()Ljava/lang/String;
    .locals 4

    .line 3583
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    .line 3584
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3585
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3587
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3589
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3590
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3591
    iput-object v3, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    .line 3593
    :cond_1
    return-object v3
.end method

.method public getContentBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3605
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    .line 3606
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3607
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3608
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3610
    iput-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    .line 3611
    return-object v2

    .line 3613
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1

    .line 4558
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    return-object v0
.end method

.method public getInsertionPoint()Ljava/lang/String;
    .locals 4

    .line 3497
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3498
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3499
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3501
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3503
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3504
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3505
    iput-object v3, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3507
    :cond_1
    return-object v3
.end method

.method public getInsertionPointBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3551
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3552
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3553
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3554
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3556
    iput-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    .line 3557
    return-object v2

    .line 3559
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 3370
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3371
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3372
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3374
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3376
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3377
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3378
    iput-object v3, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3380
    :cond_1
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3401
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3402
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3403
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3404
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3406
    iput-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    .line 3407
    return-object v2

    .line 3409
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;>;"
        }
    .end annotation

    .line 4554
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 3642
    iget v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedSize:I

    .line 3643
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 3645
    :cond_0
    const/4 v2, 0x0

    .line 3646
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3647
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 3649
    :cond_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 3650
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 3652
    :cond_2
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 3653
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    const/16 v1, 0xf

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 3655
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 3656
    iput v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedSize:I

    .line 3657
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 3261
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasContent()Z
    .locals 2

    .line 3573
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

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

.method public hasInsertionPoint()Z
    .locals 2

    .line 3455
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

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

.method public hasName()Z
    .locals 2

    .line 3351
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

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

.method public hashCode()I
    .locals 3

    .line 3692
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 3693
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedHashCode:I

    return v0

    .line 3695
    :cond_0
    const/16 v2, 0x29

    .line 3696
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 3697
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3698
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 3699
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 3701
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasInsertionPoint()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3702
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x2

    .line 3703
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getInsertionPoint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 3705
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->hasContent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3706
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0xf

    .line 3707
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 3709
    :cond_3
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 3710
    iput v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedHashCode:I

    .line 3711
    return v2
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 3326
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos;->access$3000()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    const-class v2, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    .line 3327
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 3326
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 3619
    iget-byte v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedIsInitialized:B

    .line 3620
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 3621
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 3623
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->memoizedIsInitialized:B

    .line 3624
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3243
    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    .locals 1

    .line 3784
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->newBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    .locals 2

    .line 3799
    new-instance v1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/compiler/PluginProtos$1;)V

    .line 3800
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3243
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;
    .locals 2

    .line 3792
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;-><init>(Lcom/google/protobuf/compiler/PluginProtos$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;-><init>(Lcom/google/protobuf/compiler/PluginProtos$1;)V

    .line 3793
    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$Builder;

    move-result-object v0

    .line 3792
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

    .line 3629
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3630
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 3632
    :cond_0
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3633
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->insertionPoint_:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 3635
    :cond_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 3636
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->content_:Ljava/lang/Object;

    const/16 v1, 0xf

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 3638
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 3639
    return-void
.end method
