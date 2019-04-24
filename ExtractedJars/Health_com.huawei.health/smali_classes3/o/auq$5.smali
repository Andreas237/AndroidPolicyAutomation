.class Lo/auq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic e:Lo/auq;


# direct methods
.method constructor <init>(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/auq$5;->e:Lo/auq;

    iput-object p2, p0, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-boolean p3, p0, Lo/auq$5;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 127
    const-string v0, "MediaUpload"

    const-string v1, "getMTSLoginListener onLoginSucc"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/auq$5$2;

    invoke-direct {v1, p0}, Lo/auq$5$2;-><init>(Lo/auq$5;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 137
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 142
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/auq$5$4;

    invoke-direct {v1, p0}, Lo/auq$5$4;-><init>(Lo/auq$5;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 154
    return-void
.end method
