.class Lo/ats$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ats;->c(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic e:Lo/ats;


# direct methods
.method constructor <init>(Lo/ats;Landroid/graphics/Bitmap;Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/ats$5;->e:Lo/ats;

    iput-object p2, p0, Lo/ats$5;->a:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lo/ats$5;->d:Lcom/huawei/health/sns/model/group/Group;

    iput-boolean p4, p0, Lo/ats$5;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 103
    invoke-virtual {p0, p1}, Lo/ats$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 108
    invoke-static {}, Lo/ats;->b()Ljava/lang/String;

    move-result-object v4

    .line 109
    if-eqz v4, :cond_0

    .line 111
    iget-object v0, p0, Lo/ats$5;->e:Lo/ats;

    iget-object v1, p0, Lo/ats$5;->a:Landroid/graphics/Bitmap;

    invoke-static {v1, v4}, Lo/ats;->e(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ats;->a(Lo/ats;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    :cond_0
    const/4 v5, 0x0

    .line 114
    iget-object v0, p0, Lo/ats$5;->e:Lo/ats;

    invoke-static {v0}, Lo/ats;->d(Lo/ats;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 116
    new-instance v6, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;-><init>()V

    .line 117
    iget-object v0, p0, Lo/ats$5;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v6, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->grpID_:J

    .line 118
    iget-object v0, p0, Lo/ats$5;->e:Lo/ats;

    invoke-static {v0}, Lo/ats;->d(Lo/ats;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->setFilePath(Ljava/lang/String;)V

    .line 119
    invoke-static {v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 122
    :cond_1
    iget-object v0, p0, Lo/ats$5;->e:Lo/ats;

    iget-object v1, p0, Lo/ats$5;->d:Lcom/huawei/health/sns/model/group/Group;

    iget-object v2, p0, Lo/ats$5;->a:Landroid/graphics/Bitmap;

    iget-boolean v3, p0, Lo/ats$5;->c:Z

    invoke-static {v0, v5, v1, v2, v3}, Lo/ats;->a(Lo/ats;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V

    .line 123
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
