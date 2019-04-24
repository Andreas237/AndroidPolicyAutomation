.class public Lo/aqu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field private a:Lo/bqs;

.field private e:Lo/arc;


# direct methods
.method public constructor <init>(Lo/bqs;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lo/aqu;->a:Lo/bqs;

    .line 56
    return-void
.end method

.method private a(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V
    .locals 2

    .line 98
    invoke-static {}, Lo/aqu;->c()Ljava/net/HttpCookie;

    move-result-object v1

    .line 99
    if-eqz v1, :cond_0

    .line 101
    invoke-virtual {v1}, Ljava/net/HttpCookie;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setCookie(Ljava/lang/String;)V

    .line 103
    :cond_0
    return-void
.end method

.method private static c()Ljava/net/HttpCookie;
    .locals 6

    .line 112
    sget-object v0, Lo/bpz;->b:Ljava/net/CookieManager;

    invoke-virtual {v0}, Ljava/net/CookieManager;->getCookieStore()Ljava/net/CookieStore;

    move-result-object v2

    .line 113
    invoke-interface {v2}, Ljava/net/CookieStore;->getCookies()Ljava/util/List;

    move-result-object v3

    .line 114
    if-nez v3, :cond_0

    .line 116
    const/4 v0, 0x0

    return-object v0

    .line 118
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/net/HttpCookie;

    .line 120
    invoke-virtual {v5}, Ljava/net/HttpCookie;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Ljava/net/HttpCookie;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mts"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    return-object v5

    .line 124
    :cond_1
    goto :goto_0

    .line 125
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lo/aqu;->c(Lo/bra;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/bqs;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/aqu;->a:Lo/bqs;

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/String;
    .locals 3

    .line 72
    iget-object v0, p0, Lo/aqu;->e:Lo/arc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aqu;->e:Lo/arc;

    instance-of v0, v0, Lo/ard;

    if-eqz v0, :cond_0

    .line 74
    new-instance v0, Lo/aqo;

    invoke-direct {v0}, Lo/aqo;-><init>()V

    iget-object v1, p0, Lo/aqu;->e:Lo/arc;

    check-cast v1, Lo/ard;

    invoke-virtual {v0, v1}, Lo/aqo;->c(Lo/ard;)Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    move-result-object v2

    .line 75
    invoke-direct {p0, v2}, Lo/aqu;->a(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V

    .line 76
    iget-object v0, p0, Lo/aqu;->a:Lo/bqs;

    invoke-virtual {v0, v2}, Lo/bqs;->c(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/aqu;->e:Lo/arc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/aqu;->e:Lo/arc;

    instance-of v0, v0, Lo/arb;

    if-eqz v0, :cond_1

    .line 80
    new-instance v0, Lo/aqo;

    invoke-direct {v0}, Lo/aqo;-><init>()V

    iget-object v1, p0, Lo/aqu;->e:Lo/arc;

    check-cast v1, Lo/arb;

    invoke-virtual {v0, v1}, Lo/aqo;->a(Lo/arb;)Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    move-result-object v2

    .line 81
    invoke-direct {p0, v2}, Lo/aqu;->a(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V

    .line 82
    iget-object v0, p0, Lo/aqu;->a:Lo/bqs;

    invoke-virtual {v0, v2}, Lo/bqs;->c(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V

    .line 86
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/aqu;->a:Lo/bqs;

    invoke-virtual {v0}, Lo/bqs;->a()V

    .line 88
    iget-object v0, p0, Lo/aqu;->a:Lo/bqs;

    invoke-virtual {v0}, Lo/bqs;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo/arc;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aqu;->e:Lo/arc;

    return-object v0
.end method

.method public e(Lo/arc;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/aqu;->e:Lo/arc;

    .line 41
    return-void
.end method
