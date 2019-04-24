.class final Lo/axd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->c(J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 314
    iput-wide p1, p0, Lo/axd$5;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 314
    invoke-virtual {p0, p1}, Lo/axd$5;->e(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation

    .line 318
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 319
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$5;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axi;->a(J)Ljava/util/ArrayList;

    move-result-object v4

    .line 321
    if-eqz v4, :cond_1

    .line 323
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 325
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    :cond_0
    goto :goto_0

    .line 331
    :cond_1
    return-object v3
.end method
