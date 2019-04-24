.class Lo/dmv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dmv;


# direct methods
.method constructor <init>(Lo/dmv;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lo/dmv$3;->b:Lo/dmv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 379
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 380
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 382
    :cond_0
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 383
    iget-object v0, p0, Lo/dmv$3;->b:Lo/dmv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dmv;->e(Lo/dmv;Z)Z

    .line 384
    iget-object v0, p0, Lo/dmv$3;->b:Lo/dmv;

    invoke-static {v0}, Lo/dmv;->i(Lo/dmv;)Lo/flc;

    move-result-object v0

    iget-object v1, p0, Lo/dmv$3;->b:Lo/dmv;

    invoke-static {v1}, Lo/dmv;->d(Lo/dmv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/flc;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 386
    :cond_1
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is not right!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    :goto_0
    return-void
.end method
