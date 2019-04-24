.class Lo/azp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/azp;


# direct methods
.method constructor <init>(Lo/azp;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/azp$5;->c:Lo/azp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(JLo/bat$e;)V
    .locals 5

    .line 159
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->c(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 160
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TRSInfoCallBack infoCallback.info:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v2, p3, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lo/bat$e;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lo/bat$e;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-static {v0, p1, p2, p3}, Lo/azp;->b(Lo/azp;JLo/bat$e;)V

    .line 165
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-virtual {v0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 167
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/azp;->e(Lo/azp;I)V

    .line 168
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/azp;->b(Lo/azp;ILandroid/os/Bundle;J)V

    goto :goto_1

    .line 174
    :cond_1
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->e(Lo/azp;)V

    .line 176
    :cond_2
    :goto_1
    return-void
.end method

.method public e(I)V
    .locals 3

    .line 181
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->c(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 182
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TRSInfoCallBack errorCallback(error),error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lo/azp$5;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->e(Lo/azp;)V

    .line 185
    return-void
.end method
