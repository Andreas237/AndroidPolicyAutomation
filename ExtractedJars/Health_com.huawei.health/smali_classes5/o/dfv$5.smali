.class Lo/dfv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfv;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dfv;


# direct methods
.method constructor <init>(Lo/dfv;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lo/dfv$5;->c:Lo/dfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 301
    iget-object v0, p0, Lo/dfv$5;->c:Lo/dfv;

    iget-object v0, v0, Lo/dfv;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dfv$c;

    invoke-direct {v1, p1, p2}, Lo/dfv$c;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 302
    return-void
.end method
