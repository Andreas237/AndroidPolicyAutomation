.class Lo/aum$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aum$a;->e(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/aum$a;


# direct methods
.method constructor <init>(Lo/aum$a;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lo/aum$a$4;->c:Lo/aum$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 234
    invoke-virtual {p0, p1}, Lo/aum$a$4;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 238
    const-string v0, "MediaDownload"

    const-string v1, "downloadMediaFile onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    iget-object v0, p0, Lo/aum$a$4;->c:Lo/aum$a;

    invoke-static {v0}, Lo/aum$a;->a(Lo/aum$a;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v0

    const-string v1, "login error."

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 240
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
