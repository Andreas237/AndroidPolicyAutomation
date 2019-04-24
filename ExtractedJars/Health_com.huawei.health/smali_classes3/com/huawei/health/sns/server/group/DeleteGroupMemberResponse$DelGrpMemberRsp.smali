.class public Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DelGrpMemberRsp"
.end annotation


# instance fields
.field public grpMbVersion_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getGrpMbVersion_()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;->grpMbVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public setGrpMbVersion_(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;->grpMbVersion_:Ljava/lang/String;

    .line 39
    return-void
.end method
