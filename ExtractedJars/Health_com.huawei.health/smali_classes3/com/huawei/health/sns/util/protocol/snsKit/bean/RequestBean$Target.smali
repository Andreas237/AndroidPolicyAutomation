.class public final enum Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Target"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum CISServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum IMServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum MPSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum MTSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum SensitiveWordServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field public static final enum TRSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 46
    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "SNSServer"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "MTSServer"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->MTSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "MPSServer"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->MPSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "IMServer"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->IMServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "TRSServer"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->TRSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "SensitiveWordServer"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SensitiveWordServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const-string v1, "CISServer"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->CISServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    .line 44
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->MTSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->MPSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->IMServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->TRSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SensitiveWordServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->CISServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->$VALUES:[Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;
    .locals 1

    .line 44
    const-class v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;
    .locals 1

    .line 44
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->$VALUES:[Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    return-object v0
.end method
