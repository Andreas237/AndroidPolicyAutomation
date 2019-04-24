.class Lo/aup$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aup;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aup;

.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/aup;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/aup$4;->c:Lo/aup;

    iput-object p2, p0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 90
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aup$4$3;

    invoke-direct {v1, p0}, Lo/aup$4$3;-><init>(Lo/aup$4;)V

    new-instance v2, Lo/aup$4$2;

    invoke-direct {v2, p0}, Lo/aup$4$2;-><init>(Lo/aup$4;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 153
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 158
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aup$4$1;

    invoke-direct {v1, p0}, Lo/aup$4$1;-><init>(Lo/aup$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 172
    return-void
.end method
