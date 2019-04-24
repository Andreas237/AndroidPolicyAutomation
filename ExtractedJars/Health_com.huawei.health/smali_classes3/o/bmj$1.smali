.class Lo/bmj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bmj;->e(Ljava/lang/String;Ljava/lang/String;)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/bmj;


# direct methods
.method constructor <init>(Lo/bmj;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/bmj$1;->d:Lo/bmj;

    iput-object p2, p0, Lo/bmj$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/bmj$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lo/bmj$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 77
    iget-object v0, p0, Lo/bmj$1;->d:Lo/bmj;

    iget-object v1, p0, Lo/bmj$1;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bmj;->c(Lo/bmj;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 78
    const/4 v3, 0x0

    .line 79
    if-eqz v2, :cond_0

    .line 81
    invoke-static {v2}, Lo/bae;->e(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v3

    .line 83
    :cond_0
    if-eqz v3, :cond_1

    .line 85
    iget-object v0, p0, Lo/bmj$1;->d:Lo/bmj;

    invoke-static {v0}, Lo/bmj;->d(Lo/bmj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bmj$e;

    .line 87
    iget-object v0, p0, Lo/bmj$1;->a:Ljava/lang/String;

    invoke-interface {v5, v0, v3}, Lo/bmj$e;->c(Ljava/lang/String;Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 88
    goto :goto_0

    .line 91
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
