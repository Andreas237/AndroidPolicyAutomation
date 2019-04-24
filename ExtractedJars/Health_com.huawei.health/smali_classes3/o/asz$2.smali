.class Lo/asz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz;->e(Landroid/content/Context;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/asz;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/asz;Landroid/content/Context;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/asz$2;->a:Lo/asz;

    iput-object p2, p0, Lo/asz$2;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 127
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asz$2$5;

    invoke-direct {v1, p0}, Lo/asz$2$5;-><init>(Lo/asz$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 137
    return-void
.end method

.method public e(II)V
    .locals 4

    .line 142
    move v2, p1

    .line 143
    move v3, p2

    .line 144
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asz$2$4;

    invoke-direct {v1, p0, v2, v3}, Lo/asz$2$4;-><init>(Lo/asz$2;II)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 153
    iget-object v0, p0, Lo/asz$2;->e:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 154
    return-void
.end method
