.class Lo/aup$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aup$4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/aup$4;


# direct methods
.method constructor <init>(Lo/aup$4;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/aup$4$3;->a:Lo/aup$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0, p1}, Lo/aup$4$3;->d(Lo/bra;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Integer;
    .locals 4

    .line 95
    iget-object v0, p0, Lo/aup$4$3;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->c:Lo/aup;

    iget-object v1, p0, Lo/aup$4$3;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1}, Lo/aup;->a(Lo/aup;Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v3

    .line 96
    const-string v0, "MediaTransfer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":transferMultiMessage code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
