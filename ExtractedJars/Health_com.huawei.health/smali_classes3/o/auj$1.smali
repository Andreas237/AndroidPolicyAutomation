.class Lo/auj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auj;->d(Lo/aud;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/auj;

.field final synthetic d:Lo/aud;


# direct methods
.method constructor <init>(Lo/auj;Lo/aud;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/auj$1;->a:Lo/auj;

    iput-object p2, p0, Lo/auj$1;->d:Lo/aud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 165
    iget-object v0, p0, Lo/auj$1;->a:Lo/auj;

    iget-object v1, p0, Lo/auj$1;->d:Lo/aud;

    const/4 v2, 0x1

    invoke-static {v0, v1, p2, v2}, Lo/auj;->a(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 166
    iget-object v0, p0, Lo/auj$1;->a:Lo/auj;

    invoke-static {v0, p2}, Lo/auj;->b(Lo/auj;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 167
    return-void
.end method
