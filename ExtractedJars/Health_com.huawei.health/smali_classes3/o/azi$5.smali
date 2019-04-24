.class Lo/azi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/azt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/azi;


# direct methods
.method constructor <init>(Lo/azi;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/azi$5;->e:Lo/azi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lorg/jivesoftware/smack/XMPPConnection;
    .locals 1

    .line 124
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->c(Lo/azi;)Lo/azp;

    move-result-object v0

    invoke-virtual {v0}, Lo/azp;->e()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 131
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->c(Lo/azi;)Lo/azp;

    move-result-object v0

    invoke-virtual {v0}, Lo/azp;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    invoke-interface {v0}, Lo/azf;->e()V

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->c(Lo/azi;)Lo/azp;

    move-result-object v0

    invoke-virtual {v0}, Lo/azp;->c()V

    .line 142
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2

    .line 147
    if-nez p1, :cond_0

    .line 149
    return-void

    .line 152
    :cond_0
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    if-eqz v0, :cond_1

    .line 155
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/azi;->c(Lo/azi;Ljava/lang/String;)V

    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lo/azi$5;->e:Lo/azi;

    invoke-static {v0}, Lo/azi;->a(Lo/azi;)Lo/azb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/azb;->c(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 162
    :goto_0
    return-void
.end method
