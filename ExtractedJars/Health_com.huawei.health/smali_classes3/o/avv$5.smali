.class final Lo/avv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/avv;->e(Ljava/lang/String;Lo/avv$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lo/avv$e;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/avv$e;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/avv$5;->a:Ljava/lang/String;

    iput-object p2, p0, Lo/avv$5;->e:Lo/avv$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 59
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/avv$5$2;

    invoke-direct {v1, p0}, Lo/avv$5$2;-><init>(Lo/avv$5;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 74
    return-void
.end method

.method public e(II)V
    .locals 7

    .line 79
    const-string v0, "QRCodeTask"

    const-string v1, "requestQRCode onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    move v6, p1

    .line 81
    if-nez v6, :cond_0

    .line 83
    move v6, p2

    .line 85
    :cond_0
    iget-object v0, p0, Lo/avv$5;->e:Lo/avv$e;

    if-eqz v0, :cond_1

    .line 87
    iget-object v0, p0, Lo/avv$5;->e:Lo/avv$e;

    move v1, v6

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-interface/range {v0 .. v5}, Lo/avv$e;->a(IJJ)V

    .line 89
    :cond_1
    return-void
.end method
