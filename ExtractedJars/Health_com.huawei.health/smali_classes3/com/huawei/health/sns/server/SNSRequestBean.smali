.class public abstract Lcom/huawei/health/sns/server/SNSRequestBean;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;
.source "SourceFile"


# static fields
.field public static final MODULE_GROUP:Ljava/lang/String; = "IGroup"

.field public static final MODULE_IBATCH:Ljava/lang/String; = "IBatch"

.field public static final MODULE_IFRIEND:Ljava/lang/String; = "IFriend"

.field public static final MODULE_ISNS:Ljava/lang/String; = "ISNS"


# instance fields
.field public userID_:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;-><init>()V

    .line 33
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/SNSRequestBean;->userID_:Ljava/lang/Long;

    .line 41
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/SNSRequestBean;->setTarget(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;)V

    .line 42
    return-void
.end method


# virtual methods
.method public getUserID_()Ljava/lang/Long;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/sns/server/SNSRequestBean;->userID_:Ljava/lang/Long;

    return-object v0
.end method
