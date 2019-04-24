.class Lo/azi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/StanzaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/azi;


# direct methods
.method constructor <init>(Lo/azi;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/azi$3;->a:Lo/azi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 65
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Receive SMACK Packet:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lo/bak;->b(Lorg/jivesoftware/smack/packet/Stanza;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :cond_0
    iget-object v0, p0, Lo/azi$3;->a:Lo/azi;

    invoke-static {v0}, Lo/azi;->e(Lo/azi;)Lo/azo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/azo;->d(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 71
    iget-object v0, p0, Lo/azi$3;->a:Lo/azi;

    invoke-static {v0, p1}, Lo/azi;->c(Lo/azi;Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    iget-object v0, p0, Lo/azi$3;->a:Lo/azi;

    invoke-static {v0}, Lo/azi;->a(Lo/azi;)Lo/azb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/azb;->a(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 76
    :cond_1
    return-void
.end method
