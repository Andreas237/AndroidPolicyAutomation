.class Lo/apd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apd;->e(JLandroid/os/Handler;I)V
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
.field final synthetic a:Lo/apd;

.field final synthetic c:J

.field final synthetic d:Landroid/os/Handler;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/apd;JLandroid/os/Handler;I)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/apd$4;->a:Lo/apd;

    iput-wide p2, p0, Lo/apd$4;->c:J

    iput-object p4, p0, Lo/apd$4;->d:Landroid/os/Handler;

    iput p5, p0, Lo/apd$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 98
    invoke-virtual {p0, p1}, Lo/apd$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 103
    iget-object v0, p0, Lo/apd$4;->a:Lo/apd;

    iget-wide v1, p0, Lo/apd$4;->c:J

    invoke-static {v0, v1, v2}, Lo/apd;->c(Lo/apd;J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 104
    if-eqz v3, :cond_1

    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    .line 109
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/bgh$c;->e:Lo/bgh$c;

    invoke-virtual {v0, v1, v2}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 110
    iget-object v0, p0, Lo/apd$4;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/apd$4;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/apd$4;->d:Landroid/os/Handler;

    iget v2, p0, Lo/apd$4;->e:I

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 114
    :cond_0
    goto :goto_0

    .line 117
    :cond_1
    iget-object v0, p0, Lo/apd$4;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/apd$4;->d:Landroid/os/Handler;

    iget v2, p0, Lo/apd$4;->e:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 119
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
