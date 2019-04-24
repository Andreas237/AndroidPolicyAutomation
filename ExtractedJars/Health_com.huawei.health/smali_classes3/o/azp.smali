.class public Lo/azp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/ConnectionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azp$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/azm;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final e:Landroid/content/Context;

.field private f:Landroid/os/Handler;

.field private g:Lo/azq;

.field private h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

.field private i:Lo/azj;

.field private k:Lorg/jivesoftware/smack/StanzaListener;

.field private l:Lo/bat;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/StanzaListener;Lo/azq;)V
    .locals 4

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/azp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    new-instance v0, Lo/azj;

    invoke-direct {v0}, Lo/azj;-><init>()V

    iput-object v0, p0, Lo/azp;->i:Lo/azj;

    .line 154
    new-instance v0, Lo/azp$5;

    invoke-direct {v0, p0}, Lo/azp$5;-><init>(Lo/azp;)V

    iput-object v0, p0, Lo/azp;->l:Lo/bat;

    .line 219
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/azp;->e:Landroid/content/Context;

    .line 220
    iput-object p1, p0, Lo/azp;->k:Lorg/jivesoftware/smack/StanzaListener;

    .line 221
    iput-object p2, p0, Lo/azp;->g:Lo/azq;

    .line 223
    new-instance v0, Lo/azv;

    invoke-direct {v0}, Lo/azv;-><init>()V

    invoke-static {v0}, Lorg/jivesoftware/smack/SmackConfiguration;->setDebuggerFactory(Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;)V

    .line 224
    new-instance v0, Lo/azw;

    invoke-direct {v0}, Lo/azw;-><init>()V

    invoke-static {v0}, Lorg/jivesoftware/smack/SmackConfiguration;->setLoggerFactory(Lorg/jivesoftware/smack/android/SmackLoggerFactory;)V

    .line 225
    invoke-direct {p0}, Lo/azp;->b()Landroid/os/HandlerThread;

    move-result-object v2

    .line 226
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    .line 227
    if-eqz v3, :cond_0

    .line 229
    new-instance v0, Lo/azp$c;

    invoke-direct {v0, p0, v3}, Lo/azp$c;-><init>(Lo/azp;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    .line 231
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Exception;)Lo/azd$a;
    .locals 3

    .line 670
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/azp;->a(I)V

    .line 672
    instance-of v0, p1, Ljava/io/IOException;

    if-nez v0, :cond_0

    .line 676
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 677
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connect to IM Server failed, host:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-direct {p0, v1, v0, p1}, Lo/azp;->e(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 679
    :cond_0
    instance-of v0, p1, Lorg/jivesoftware/smack/SmackException$SeeOtherHostException;

    if-eqz v0, :cond_1

    .line 682
    sget-object v0, Lo/azd$a;->d:Lo/azd$a;

    return-object v0

    .line 684
    :cond_1
    sget-object v0, Lo/azd$a;->a:Lo/azd$a;

    return-object v0
.end method

.method static synthetic a(Lo/azp;)Lo/azd$a;
    .locals 1

    .line 59
    invoke-direct {p0}, Lo/azp;->f()Lo/azd$a;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 1

    .line 205
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    sget-object v0, Lo/azd$a;->b:Lo/azd$a;

    invoke-direct {p0, v0}, Lo/azp;->e(Lo/azd$a;)V

    .line 210
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 809
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    if-eqz v0, :cond_0

    .line 811
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v1, p0, Lo/azp;->k:Lorg/jivesoftware/smack/StanzaListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->removeAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    .line 812
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->removeConnectionListener(Lorg/jivesoftware/smack/ConnectionListener;)V

    .line 815
    :try_start_0
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->disconnect(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 823
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 824
    goto :goto_0

    .line 817
    :catch_0
    move-exception v2

    .line 819
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection disconnection meet exception!"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 823
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 824
    goto :goto_0

    .line 823
    :catchall_0
    move-exception v3

    const/4 v0, 0x0

    iput-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 824
    throw v3

    .line 826
    :cond_0
    :goto_0
    return-void
.end method

.method private a(JLo/bat$e;)V
    .locals 1

    .line 195
    new-instance v0, Lo/bau;

    invoke-direct {v0, p1, p2}, Lo/bau;-><init>(J)V

    invoke-virtual {v0, p3}, Lo/bau;->e(Lo/bat$e;)Z

    .line 196
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0, p3}, Lo/azj;->c(Lo/bat$e;)V

    .line 197
    return-void
.end method

.method private a(Lo/azm;)V
    .locals 2

    .line 760
    invoke-virtual {p1}, Lo/azm;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 763
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {p1}, Lo/azm;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ave;->b(Ljava/lang/String;)V

    .line 765
    :cond_0
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->d()V

    .line 768
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/azm;->e(Z)V

    .line 769
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/azm;->a(Z)V

    .line 770
    return-void
.end method

.method static synthetic a(Lo/azp;Landroid/os/Bundle;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/azp;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method private b()Landroid/os/HandlerThread;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 235
    new-instance v1, Landroid/os/HandlerThread;

    const-string v0, "ConnectionHandler"

    invoke-direct {v1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 237
    return-object v1
.end method

.method static synthetic b(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private b(Ljava/lang/Exception;)Lo/azd$a;
    .locals 5

    .line 718
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 720
    instance-of v0, p1, Lorg/jivesoftware/smack/sasl/SASLErrorException;

    if-eqz v0, :cond_1

    .line 722
    move-object v3, p1

    check-cast v3, Lorg/jivesoftware/smack/sasl/SASLErrorException;

    .line 723
    invoke-virtual {v3}, Lorg/jivesoftware/smack/sasl/SASLErrorException;->getSASLFailure()Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;

    move-result-object v4

    .line 724
    if-eqz v4, :cond_0

    sget-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_servicetoken:Lorg/jivesoftware/smack/sasl/SASLError;

    invoke-virtual {v4}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->getSASLError()Lorg/jivesoftware/smack/sasl/SASLError;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 726
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection authenticate failed!(SASLError.invalid_serviceToken)"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    sget-object v0, Lo/azd$a;->h:Lo/azd$a;

    return-object v0

    .line 732
    :cond_0
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection authenticate failed! "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 734
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authenticate failed SASLFailure, host:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0, p1}, Lo/azp;->e(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 735
    sget-object v0, Lo/azd$a;->g:Lo/azd$a;

    return-object v0

    .line 738
    :cond_1
    instance-of v0, p1, Lorg/jivesoftware/smack/SmackException$NoResponseException;

    if-eqz v0, :cond_2

    .line 740
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection authenticate failed, NoResponseException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 741
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authenticate failed NoResponseException, host:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v1, v0, p1}, Lo/azp;->e(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 743
    sget-object v0, Lo/azd$a;->i:Lo/azd$a;

    return-object v0

    .line 747
    :cond_2
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection authenticate failed! Other Error!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authenticate failed, Other Error, host:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0, p1}, Lo/azp;->e(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 749
    sget-object v0, Lo/azd$a;->g:Lo/azd$a;

    return-object v0
.end method

.method private b(Lo/azm;)Lorg/jivesoftware/smack/SASLConfiguration;
    .locals 4

    .line 919
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getSASLConfiguration:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/azm;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 922
    new-instance v3, Lorg/jivesoftware/smack/SASLConfiguration;

    invoke-direct {v3}, Lorg/jivesoftware/smack/SASLConfiguration;-><init>()V

    .line 923
    invoke-virtual {p1}, Lo/azm;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->resource:Ljava/lang/String;

    .line 924
    invoke-virtual {p1}, Lo/azm;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->serviceName:Ljava/lang/String;

    .line 925
    invoke-virtual {p1}, Lo/azm;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->ServiceToken:Ljava/lang/String;

    .line 926
    const-string v0, "com.huawei.health"

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->appid:Ljava/lang/String;

    .line 927
    invoke-virtual {p1}, Lo/azm;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 929
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/azm;->a(Ljava/lang/String;)V

    .line 931
    :cond_0
    invoke-virtual {p1}, Lo/azm;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    .line 932
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IM Auth PushToken is empty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 933
    invoke-virtual {p1}, Lo/azm;->i()J

    move-result-wide v0

    iput-wide v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->uid:J

    .line 934
    invoke-virtual {p1}, Lo/azm;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->deviceID:Ljava/lang/String;

    .line 935
    invoke-virtual {p1}, Lo/azm;->h()Z

    move-result v0

    iput-boolean v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->check_online:Z

    .line 936
    invoke-static {}, Lo/bar;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->phoneType:Ljava/lang/String;

    .line 937
    invoke-virtual {p1}, Lo/azm;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->clientVersion:Ljava/lang/String;

    .line 938
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    iput-object v0, v3, Lorg/jivesoftware/smack/SASLConfiguration;->romVersion:Ljava/lang/String;

    .line 939
    return-object v3
.end method

.method private b(JLjava/lang/String;)V
    .locals 3

    .line 346
    iget-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 348
    return-void

    .line 350
    :cond_0
    const-string v0, "SNSIMConnection"

    const-string v1, "Begin to request server TRSInfo."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    new-instance v2, Lo/bau;

    invoke-direct {v2, p1, p2}, Lo/bau;-><init>(J)V

    .line 352
    iget-object v0, p0, Lo/azp;->l:Lo/bat;

    invoke-virtual {v2, v0, p3}, Lo/bau;->e(Lo/bat;Ljava/lang/String;)V

    .line 353
    return-void
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 3

    .line 419
    const/4 v2, 0x0

    .line 420
    if-eqz p1, :cond_0

    .line 422
    const-string v0, "disType"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 424
    :cond_0
    invoke-direct {p0, v2}, Lo/azp;->a(I)V

    .line 425
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->d()V

    .line 426
    return-void
.end method

.method private b(Lo/azd$a;)V
    .locals 7

    .line 530
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    return-void

    .line 535
    :cond_0
    sget-object v0, Lo/azd$a;->g:Lo/azd$a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lo/azd$a;->i:Lo/azd$a;

    if-ne p1, v0, :cond_4

    .line 537
    :cond_1
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 539
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 541
    invoke-direct {p0, p1}, Lo/azp;->e(Lo/azd$a;)V

    .line 542
    return-void

    .line 544
    :cond_2
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 546
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 548
    invoke-direct {p0, p1}, Lo/azp;->e(Lo/azd$a;)V

    .line 549
    return-void

    .line 551
    :cond_3
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->o()I

    move-result v0

    invoke-static {v0}, Lo/bah;->b(I)I

    move-result v0

    int-to-long v4, v0

    .line 552
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connect IM Server auth failed,delay "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds to retry."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v4, v5}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 554
    goto/16 :goto_0

    .line 555
    :cond_4
    sget-object v0, Lo/azd$a;->h:Lo/azd$a;

    if-ne p1, v0, :cond_5

    .line 557
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 559
    invoke-direct {p0, p1}, Lo/azp;->e(Lo/azd$a;)V

    .line 560
    invoke-static {}, Lo/azx;->e()Lo/azx;

    move-result-object v0

    invoke-virtual {v0}, Lo/azx;->d()V

    goto/16 :goto_0

    .line 562
    :cond_5
    sget-object v0, Lo/azd$a;->e:Lo/azd$a;

    if-eq p1, v0, :cond_6

    sget-object v0, Lo/azd$a;->b:Lo/azd$a;

    if-ne p1, v0, :cond_7

    .line 565
    :cond_6
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 567
    invoke-direct {p0, p1}, Lo/azp;->e(Lo/azd$a;)V

    goto/16 :goto_0

    .line 569
    :cond_7
    sget-object v0, Lo/azd$a;->a:Lo/azd$a;

    if-ne p1, v0, :cond_a

    .line 571
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->i()Z

    move-result v0

    if-nez v0, :cond_8

    .line 573
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 574
    invoke-direct {p0, p1}, Lo/azp;->e(Lo/azd$a;)V

    goto/16 :goto_0

    .line 576
    :cond_8
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->h()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 578
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->f()I

    move-result v0

    int-to-long v4, v0

    .line 579
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connect IM Server max retry,delay "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds to request trs server info."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 582
    const-string v0, "userID"

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->g()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 583
    const-string v0, "deviceID"

    iget-object v1, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v1}, Lo/azj;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    const/4 v0, 0x2

    invoke-direct {p0, v0, v6, v4, v5}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 585
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/azj;->b(Z)V

    .line 586
    goto :goto_0

    .line 590
    :cond_9
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->o()I

    move-result v0

    invoke-static {v0}, Lo/bah;->b(I)I

    move-result v4

    .line 591
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connect IM Server failed,delay "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds to retry."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 593
    int-to-long v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 596
    :cond_a
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/azp;ILandroid/os/Bundle;J)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    return-void
.end method

.method static synthetic b(Lo/azp;JLo/bat$e;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lo/azp;->a(JLo/bat$e;)V

    return-void
.end method

.method static synthetic c(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private c(I)V
    .locals 1

    .line 855
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 857
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 859
    :cond_0
    return-void
.end method

.method private c(ILandroid/os/Bundle;J)V
    .locals 4

    .line 837
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 839
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 840
    if-eqz p2, :cond_0

    .line 842
    invoke-virtual {v3, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 844
    :cond_0
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p3

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 846
    :cond_1
    return-void
.end method

.method private c(Lo/azm;)V
    .locals 5

    .line 866
    invoke-static {}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->builder()Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;

    move-result-object v3

    .line 870
    :try_start_0
    invoke-virtual {p1}, Lo/azm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setXmppDomain(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    .line 875
    goto :goto_0

    .line 872
    :catch_0
    move-exception v4

    .line 874
    const-string v0, "SNSIMConnection"

    const-string v1, "initConnection exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    :goto_0
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setHost(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 877
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->e()I

    move-result v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setPort(I)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 879
    invoke-virtual {p1}, Lo/azm;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setAppVersion(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 889
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setDebuggerEnabled(Z)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 893
    sget-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->required:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setSecurityMode(Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 894
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setCompressionEnabled(Z)Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;

    .line 895
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setSendPresence(Z)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 899
    invoke-static {}, Lo/bck;->a()Lo/ecu;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->setCustomX509TrustManager(Ljavax/net/ssl/X509TrustManager;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 902
    new-instance v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v3}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration$Builder;->build()Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;-><init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;)V

    iput-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 903
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {p1}, Lo/azm;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->setUID(J)V

    .line 904
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->setSelfFullJid(Ljava/lang/String;)V

    .line 906
    iget-object v0, p0, Lo/azp;->k:Lorg/jivesoftware/smack/StanzaListener;

    if-eqz v0, :cond_0

    .line 908
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v1, p0, Lo/azp;->k:Lorg/jivesoftware/smack/StanzaListener;

    invoke-static {}, Lo/azp;->i()Lorg/jivesoftware/smack/filter/StanzaFilter;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->addAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 910
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/azp;Lo/azd$a;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/azp;->b(Lo/azd$a;)V

    return-void
.end method

.method static synthetic d(Lo/azp;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/azp;->k()V

    return-void
.end method

.method private e(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 4

    .line 696
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " errorReason:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v2, p3, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    iget-object v0, p0, Lo/azp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 701
    const-string v3, ""

    .line 702
    if-eqz p3, :cond_1

    .line 704
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v3

    .line 706
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " clsName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bpj;->c(ILjava/lang/String;)V

    .line 708
    :cond_2
    return-void
.end method

.method private e(Lo/azd$a;)V
    .locals 1

    .line 796
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    if-eqz v0, :cond_0

    .line 798
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    invoke-interface {v0, p1}, Lo/azq;->c(Lo/azd$a;)V

    .line 800
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/azp;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/azp;->a()V

    return-void
.end method

.method static synthetic e(Lo/azp;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/azp;->c(I)V

    return-void
.end method

.method static synthetic e(Lo/azp;JLjava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lo/azp;->b(JLjava/lang/String;)V

    return-void
.end method

.method private f()Lo/azd$a;
    .locals 6

    .line 605
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    if-eqz v0, :cond_0

    .line 607
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    invoke-interface {v0}, Lo/azq;->b()V

    .line 609
    :cond_0
    iget-object v0, p0, Lo/azp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/azm;

    .line 610
    if-nez v3, :cond_1

    .line 612
    const-string v0, "SNSIMConnection"

    const-string v1, "Build XMPPConnection but LoginParam is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    sget-object v0, Lo/azd$a;->b:Lo/azd$a;

    return-object v0

    .line 616
    :cond_1
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build XMPPConnection param:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/azm;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/azp;->a(I)V

    .line 622
    invoke-direct {p0, v3}, Lo/azp;->c(Lo/azm;)V

    .line 624
    iget-object v0, p0, Lo/azp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 626
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 627
    sget-object v0, Lo/azd$a;->e:Lo/azd$a;

    return-object v0

    .line 630
    :cond_2
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->b()V

    .line 633
    const-string v0, "SNSIMConnection"

    const-string v1, "Begin to connect access server."

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->addConnectionListener(Lorg/jivesoftware/smack/ConnectionListener;)V

    .line 635
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->connect()Lorg/jivesoftware/smack/AbstractXMPPConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    goto :goto_0

    .line 637
    :catch_0
    move-exception v4

    .line 639
    const-string v0, "SNSIMConnection"

    const-string v1, "Connect to access server failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    invoke-direct {p0, v4}, Lo/azp;->a(Ljava/lang/Exception;)Lo/azd$a;

    move-result-object v0

    return-object v0

    .line 643
    :goto_0
    invoke-direct {p0, v3}, Lo/azp;->b(Lo/azm;)Lorg/jivesoftware/smack/SASLConfiguration;

    move-result-object v4

    .line 644
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Begin to authenticate XMPPConnection. PushToken is empty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v4, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Begin to authenticate XMPPConnection. PushToken is empty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/jivesoftware/smack/SASLConfiguration;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    :try_start_1
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0, v4}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->login(Lorg/jivesoftware/smack/SASLConfiguration;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 655
    goto :goto_1

    .line 650
    :catch_1
    move-exception v5

    .line 652
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 653
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/azp;->a(I)V

    .line 654
    invoke-direct {p0, v5}, Lo/azp;->b(Ljava/lang/Exception;)Lo/azd$a;

    move-result-object v0

    return-object v0

    .line 657
    :goto_1
    invoke-direct {p0, v3}, Lo/azp;->a(Lo/azm;)V

    .line 658
    iget-object v0, p0, Lo/azp;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 659
    sget-object v0, Lo/azd$a;->c:Lo/azd$a;

    return-object v0
.end method

.method static synthetic f(Lo/azp;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/azp;->g()V

    return-void
.end method

.method private g()V
    .locals 6

    .line 391
    invoke-direct {p0}, Lo/azp;->h()Z

    move-result v4

    .line 392
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v5

    .line 393
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "detect XMPPConnection is available:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isStopConn:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    if-nez v4, :cond_0

    .line 396
    if-nez v5, :cond_1

    .line 399
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 400
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    goto :goto_0

    .line 406
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 408
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bca;->c(Z)V

    .line 410
    :cond_1
    :goto_0
    return-void
.end method

.method private h()Z
    .locals 2

    .line 378
    const/4 v1, 0x0

    .line 379
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    invoke-virtual {v0}, Lo/azz;->d()Z

    move-result v1

    .line 383
    :cond_0
    return v1
.end method

.method private static i()Lorg/jivesoftware/smack/filter/StanzaFilter;
    .locals 1

    .line 435
    new-instance v0, Lo/azp$1;

    invoke-direct {v0}, Lo/azp$1;-><init>()V

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 777
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    if-eqz v0, :cond_0

    .line 779
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    invoke-interface {v0}, Lo/azq;->d()V

    .line 781
    :cond_0
    return-void
.end method

.method private n()V
    .locals 1

    .line 788
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    if-eqz v0, :cond_0

    .line 790
    iget-object v0, p0, Lo/azp;->g:Lo/azq;

    invoke-interface {v0}, Lo/azq;->a()V

    .line 792
    :cond_0
    return-void
.end method

.method private o()V
    .locals 5

    .line 992
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 995
    const/4 v4, 0x3

    .line 996
    iget-object v0, p0, Lo/azp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 998
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->o()I

    move-result v0

    invoke-static {v0}, Lo/bah;->b(I)I

    move-result v4

    .line 1000
    :cond_0
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1002
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleConnectionError: delaySeconds:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to rebuild connection."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1003
    invoke-direct {p0}, Lo/azp;->n()V

    .line 1005
    int-to-long v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    goto :goto_0

    .line 1009
    :cond_1
    const-string v0, "SNSIMConnection"

    const-string v1, "handleConnectionError,user stop connection."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    :goto_0
    return-void
.end method


# virtual methods
.method public authenticated(Lorg/jivesoftware/smack/XMPPConnection;Z)V
    .locals 2

    .line 1022
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection authenticated."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1023
    return-void
.end method

.method public c()V
    .locals 4

    .line 360
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    :cond_0
    const-string v0, "SNSIMConnection"

    const-string v1, "validIfNeedRebuild.user stop or isRequest trs or doLogin.return."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    return-void

    .line 367
    :cond_1
    const-string v0, "SNSIMConnection"

    const-string v1, "validIfNeedRebuild. trigger detect connection handle message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    const/4 v0, 0x4

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 369
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 307
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "destroyConnection, type isQuitAccount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 310
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 313
    iget-object v0, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 315
    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 316
    :goto_0
    iget-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 318
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 319
    const-string v0, "DisType"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 321
    const/4 v0, 0x3

    const-wide/16 v1, 0x0

    invoke-direct {p0, v0, v4, v1, v2}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 322
    goto :goto_1

    .line 325
    :cond_1
    invoke-direct {p0, v3}, Lo/azp;->a(I)V

    .line 326
    const-string v0, "SNSIMConnection"

    const-string v1, "destroyConnection XMPPConnection is released!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    :goto_1
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->d()V

    .line 331
    if-eqz p1, :cond_2

    .line 333
    iget-object v0, p0, Lo/azp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->k()V

    .line 336
    :cond_2
    return-void
.end method

.method public connected(Lorg/jivesoftware/smack/XMPPConnection;)V
    .locals 2

    .line 1016
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection connected."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1017
    return-void
.end method

.method public connectionClosed()V
    .locals 2

    .line 1028
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection connectionClosed."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1029
    return-void
.end method

.method public connectionClosedOnError(Ljava/lang/Exception;)V
    .locals 4

    .line 961
    const-string v0, "SNSIMConnection"

    const-string v1, "connectionClosedOnError."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 962
    instance-of v0, p1, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    if-eqz v0, :cond_2

    .line 964
    move-object v0, p1

    check-cast v0, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    invoke-static {v0}, Lo/azr;->b(Lorg/jivesoftware/smack/XMPPException$StreamErrorException;)I

    move-result v3

    .line 965
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 968
    sget-object v0, Lo/azd$a;->b:Lo/azd$a;

    invoke-direct {p0, v0}, Lo/azp;->e(Lo/azd$a;)V

    .line 969
    return-void

    .line 971
    :cond_0
    const/4 v0, 0x2

    if-ne v3, v0, :cond_2

    .line 973
    invoke-virtual {p0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 976
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v0}, Lo/azj;->g()J

    move-result-wide v0

    iget-object v2, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v2}, Lo/azj;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/azp;->b(JLjava/lang/String;)V

    .line 977
    invoke-direct {p0}, Lo/azp;->n()V

    .line 979
    :cond_1
    return-void

    .line 983
    :cond_2
    invoke-direct {p0}, Lo/azp;->o()V

    .line 984
    return-void
.end method

.method public d(Lo/azm;)V
    .locals 6

    .line 247
    if-nez p1, :cond_0

    .line 249
    return-void

    .line 251
    :cond_0
    iget-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 253
    :cond_1
    const-string v0, "SNSIMConnection"

    const-string v1, "buildConnection,current Handle is req trs or do login."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    return-void

    .line 257
    :cond_2
    const-string v0, "SNSIMConnection"

    const-string v1, "buildConnection, call Handle to build SNSConnection."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/azp;->c(I)V

    .line 260
    iget-object v0, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 263
    iget-object v0, p0, Lo/azp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {p1}, Lo/azm;->i()J

    move-result-wide v1

    invoke-virtual {p1}, Lo/azm;->g()Z

    move-result v3

    invoke-virtual {p1}, Lo/azm;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/azj;->d(JZLjava/lang/String;)V

    .line 269
    new-instance v5, Lo/bau;

    invoke-virtual {p1}, Lo/azm;->i()J

    move-result-wide v0

    invoke-direct {v5, v0, v1}, Lo/bau;-><init>(J)V

    .line 270
    iget-object v0, p0, Lo/azp;->i:Lo/azj;

    invoke-virtual {v5}, Lo/bau;->e()Lo/bat$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azj;->c(Lo/bat$e;)V

    .line 273
    invoke-virtual {v5}, Lo/bau;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 275
    iget-object v0, p0, Lo/azp;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 276
    iget-object v0, p0, Lo/azp;->l:Lo/bat;

    invoke-virtual {p1}, Lo/azm;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lo/bau;->e(Lo/bat;Ljava/lang/String;)V

    goto :goto_0

    .line 280
    :cond_3
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/azp;->c(ILandroid/os/Bundle;J)V

    .line 282
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 950
    iget-object v0, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public e()Lorg/jivesoftware/smack/XMPPConnection;
    .locals 3

    .line 291
    iget-object v0, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    :cond_0
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getConnection return null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/azp;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/azp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_1
    iget-object v0, p0, Lo/azp;->h:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    return-object v0
.end method

.method public reconnectingIn(I)V
    .locals 2

    .line 1040
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection reconnectingIn."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1041
    return-void
.end method

.method public reconnectionFailed(Ljava/lang/Exception;)V
    .locals 2

    .line 1046
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection reconnectionFailed."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1047
    return-void
.end method

.method public reconnectionSuccessful()V
    .locals 2

    .line 1034
    const-string v0, "SNSIMConnection"

    const-string v1, "XMPPConnection reconnectionSuccessful."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1035
    return-void
.end method
