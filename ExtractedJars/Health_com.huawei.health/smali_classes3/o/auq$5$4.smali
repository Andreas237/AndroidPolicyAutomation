.class Lo/auq$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auq$5;->e(II)V
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
.field final synthetic d:Lo/auq$5;


# direct methods
.method constructor <init>(Lo/auq$5;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/auq$5$4;->d:Lo/auq$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 143
    invoke-virtual {p0, p1}, Lo/auq$5$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 147
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lo/auq$5$4;->d:Lo/auq$5;

    iget-object v0, v0, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 149
    iget-object v0, p0, Lo/auq$5$4;->d:Lo/auq$5;

    iget-object v0, v0, Lo/auq$5;->e:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$5$4;->d:Lo/auq$5;

    iget-object v1, v1, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$5$4;->d:Lo/auq$5;

    iget-object v2, v2, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 150
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/auq$5$4;->d:Lo/auq$5;

    iget-object v1, v1, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 151
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
