.class final Lo/asu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asu;->d(Lo/asu;Landroid/content/Context;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/asu;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/asu;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lo/asu$4;->d:Landroid/content/Context;

    iput-object p2, p0, Lo/asu$4;->b:Lo/asu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 274
    invoke-virtual {p0, p1}, Lo/asu$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 279
    new-instance v2, Lcom/huawei/health/sns/server/group/CreateGroupRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;-><init>()V

    .line 280
    iget-object v0, p0, Lo/asu$4;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_default_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 281
    iget-object v0, p0, Lo/asu$4;->b:Lo/asu;

    invoke-static {v0, v3}, Lo/asu;->c(Lo/asu;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 282
    invoke-virtual {v2, v4}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpName_(Ljava/lang/String;)V

    .line 283
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpTags_(Ljava/lang/String;)V

    .line 284
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 285
    iget-object v0, p0, Lo/asu$4;->b:Lo/asu;

    const/4 v1, 0x0

    invoke-static {v0, v5, v2, v1}, Lo/asu;->c(Lo/asu;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V

    .line 286
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
