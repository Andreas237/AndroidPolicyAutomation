.class Lo/asw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asw;->a(Landroid/content/Context;ILcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/asw;

.field final synthetic c:Lcom/huawei/health/sns/model/group/GroupMember;

.field final synthetic d:I

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/asw;Lcom/huawei/health/sns/model/group/GroupMember;ILandroid/content/Context;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/asw$3;->a:Lo/asw;

    iput-object p2, p0, Lo/asw$3;->c:Lcom/huawei/health/sns/model/group/GroupMember;

    iput p3, p0, Lo/asw$3;->d:I

    iput-object p4, p0, Lo/asw$3;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 66
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asw$3$4;

    invoke-direct {v1, p0}, Lo/asw$3$4;-><init>(Lo/asw$3;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 102
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 107
    iget-object v0, p0, Lo/asw$3;->e:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 108
    return-void
.end method
