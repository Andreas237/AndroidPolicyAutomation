.class public final enum Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

.field public static final enum b:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

.field public static final enum c:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

.field public static final enum d:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

.field private static h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;>;"
        }
    .end annotation
.end field

.field private static final synthetic k:[Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 16
    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const-string v1, "CreateGroup"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->a:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const-string v1, "DissolveGroup"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->d:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const-string v1, "ModifyGroupInfo"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->c:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const-string v1, "GroupTransfer"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    .line 14
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->a:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->d:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->c:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->k:[Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    .line 19
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->h:Landroid/util/SparseArray;

    .line 23
    invoke-static {}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->values()[Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 25
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v7}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b()I

    move-result v1

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 23
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 31
    iput p3, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->e:I

    .line 32
    return-void
.end method

.method public static c(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
    .locals 3

    .line 42
    const/4 v1, -0x1

    .line 45
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 50
    goto :goto_0

    .line 47
    :catch_0
    move-exception v2

    .line 49
    const/4 v0, 0x0

    return-object v0

    .line 51
    :goto_0
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
    .locals 1

    .line 14
    const-class v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
    .locals 1

    .line 14
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->k:[Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->e:I

    .line 37
    return v0
.end method
