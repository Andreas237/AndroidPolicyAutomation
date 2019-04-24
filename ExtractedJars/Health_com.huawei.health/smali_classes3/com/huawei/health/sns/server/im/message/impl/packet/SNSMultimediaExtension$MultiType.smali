.class public final enum Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MultiType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

.field public static final enum Audio:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

.field public static final enum Image:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

.field public static final enum Link:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

.field public static final enum Video:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;


# instance fields
.field private mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 14
    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const-string v1, "Image"

    const-string v2, "image"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Image:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const-string v1, "Video"

    const-string v2, "video"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Video:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const-string v1, "Audio"

    const-string v2, "audio"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Audio:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const-string v1, "Link"

    const-string v2, "link"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Link:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    .line 12
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    sget-object v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Image:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Video:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Audio:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Link:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->$VALUES:[Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    iput-object p3, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->mType:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;
    .locals 1

    .line 12
    const-class v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;
    .locals 1

    .line 12
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->$VALUES:[Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->mType:Ljava/lang/String;

    .line 27
    return-object v0
.end method
