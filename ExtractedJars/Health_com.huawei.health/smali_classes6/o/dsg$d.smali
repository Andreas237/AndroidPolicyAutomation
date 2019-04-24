.class Lo/dsg$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Landroid/os/Handler;

.field c:Lo/dsl;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field final synthetic k:Lo/dsg;


# direct methods
.method constructor <init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 5

    .line 106
    iput-object p1, p0, Lo/dsg$d;->k:Lo/dsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p2, p0, Lo/dsg$d;->b:Landroid/os/Handler;

    .line 108
    iput-object p3, p0, Lo/dsg$d;->e:Ljava/lang/String;

    .line 109
    iput-object p4, p0, Lo/dsg$d;->d:Ljava/lang/String;

    .line 110
    iput-object p7, p0, Lo/dsg$d;->c:Lo/dsl;

    .line 111
    iput-object p5, p0, Lo/dsg$d;->a:Ljava/lang/String;

    .line 112
    iput-object p6, p0, Lo/dsg$d;->g:Ljava/lang/String;

    .line 113
    invoke-static {}, Lo/drs;->b()Lo/drs;

    move-result-object v0

    invoke-virtual {v0}, Lo/drs;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 121
    const-string v0, "sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v4}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dsg$d;->h:Ljava/lang/String;

    .line 123
    return-void
.end method

.method constructor <init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/dsg$d;->k:Lo/dsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p2, p0, Lo/dsg$d;->b:Landroid/os/Handler;

    .line 101
    iput-object p3, p0, Lo/dsg$d;->e:Ljava/lang/String;

    .line 102
    iput-object p4, p0, Lo/dsg$d;->d:Ljava/lang/String;

    .line 103
    iput-object p6, p0, Lo/dsg$d;->c:Lo/dsl;

    .line 104
    iput-object p5, p0, Lo/dsg$d;->a:Ljava/lang/String;

    .line 105
    return-void
.end method

.method constructor <init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/dsg$d;->k:Lo/dsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p2, p0, Lo/dsg$d;->b:Landroid/os/Handler;

    .line 94
    iput-object p3, p0, Lo/dsg$d;->e:Ljava/lang/String;

    .line 95
    iput-object p4, p0, Lo/dsg$d;->d:Ljava/lang/String;

    .line 96
    iput-object p5, p0, Lo/dsg$d;->c:Lo/dsl;

    .line 97
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 127
    const/4 v6, 0x0

    .line 129
    :try_start_0
    invoke-static {}, Lo/dse;->b()Lo/dse;

    move-result-object v0

    iget-object v1, p0, Lo/dsg$d;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/dsg$d;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/dsg$d;->a:Ljava/lang/String;

    iget-object v4, p0, Lo/dsg$d;->g:Ljava/lang/String;

    iget-object v5, p0, Lo/dsg$d;->h:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lo/dse;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 135
    if-eqz v6, :cond_0

    .line 136
    iget-object v0, p0, Lo/dsg$d;->b:Landroid/os/Handler;

    new-instance v1, Lo/dsg$e;

    iget-object v2, p0, Lo/dsg$d;->k:Lo/dsg;

    iget-object v3, p0, Lo/dsg$d;->c:Lo/dsl;

    invoke-direct {v1, v2, v6, v3}, Lo/dsg$e;-><init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 130
    :catch_0
    move-exception v7

    .line 131
    const-string v0, "AsyncHttpUtils"

    const-string v1, "doPostRequest->NoSuchAlgorithmException"

    :try_start_1
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    goto :goto_0

    .line 132
    .line 136
    :catch_1
    move-exception v7

    .line 133
    const-string v0, "AsyncHttpUtils"

    const-string v1, "doPostRequest->KeyManagementException"

    :try_start_2
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    goto :goto_0

    .line 135
    .line 136
    :catchall_0
    move-exception v8

    nop

    .line 136
    throw v8

    .line 139
    :cond_0
    :goto_0
    return-void
.end method
