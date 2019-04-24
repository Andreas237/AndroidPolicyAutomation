.class public Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ApplyForJoinGrpRsp"
.end annotation


# instance fields
.field public grpMbVersion_:Ljava/lang/String;

.field public result_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;->result_:I

    return-void
.end method


# virtual methods
.method public getGrpMbVersion_()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;->grpMbVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public setGrpMbVersion_(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;->grpMbVersion_:Ljava/lang/String;

    .line 44
    return-void
.end method
