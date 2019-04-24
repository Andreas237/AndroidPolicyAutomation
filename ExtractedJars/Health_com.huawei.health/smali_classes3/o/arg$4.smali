.class Lo/arg$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arg;->e(Lcom/huawei/health/sns/model/user/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/user/User;

.field final synthetic c:Lo/arg;


# direct methods
.method constructor <init>(Lo/arg;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lo/arg$4;->c:Lo/arg;

    iput-object p2, p0, Lo/arg$4;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 230
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arg$4$2;

    invoke-direct {v1, p0}, Lo/arg$4$2;-><init>(Lo/arg$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 242
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 247
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arg$4$1;

    invoke-direct {v1, p0}, Lo/arg$4$1;-><init>(Lo/arg$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 257
    iget-object v0, p0, Lo/arg$4;->c:Lo/arg;

    const v1, 0xad04

    invoke-static {v0, v1, p1, p2}, Lo/arg;->e(Lo/arg;III)V

    .line 258
    const-string v0, "AssistantDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestAssistantInfo failed, login error, rc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", rtc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    return-void
.end method
