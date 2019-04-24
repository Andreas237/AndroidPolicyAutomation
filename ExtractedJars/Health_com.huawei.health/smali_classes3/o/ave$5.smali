.class Lo/ave$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ave;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ave;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/ave;Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lo/ave$5;->c:Lo/ave;

    iput-object p2, p0, Lo/ave$5;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 2

    .line 297
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_0

    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 299
    iget-object v0, p0, Lo/ave$5;->c:Lo/ave;

    iget-object v1, p0, Lo/ave$5;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ave;->c(Ljava/lang/String;)V

    .line 302
    :cond_0
    iget-object v0, p0, Lo/ave$5;->c:Lo/ave;

    invoke-static {v0}, Lo/ave;->a(Lo/ave;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 303
    return-void
.end method
