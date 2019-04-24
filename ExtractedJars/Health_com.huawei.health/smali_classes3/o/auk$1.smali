.class Lo/auk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auk;->b(Lo/aud;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aud;

.field final synthetic d:Lo/auk;


# direct methods
.method constructor <init>(Lo/auk;Lo/aud;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/auk$1;->d:Lo/auk;

    iput-object p2, p0, Lo/auk$1;->a:Lo/aud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 129
    const-string v0, "MediaServerLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invokeMTSServer response:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lo/auk$1;->d:Lo/auk;

    iget-object v1, p0, Lo/auk$1;->a:Lo/aud;

    invoke-static {v0, v1, p2}, Lo/auk;->c(Lo/auk;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 131
    iget-object v0, p0, Lo/auk$1;->d:Lo/auk;

    invoke-static {v0, p2}, Lo/auk;->d(Lo/auk;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 132
    return-void
.end method
