.class Lo/dgr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dgr;


# direct methods
.method constructor <init>(Lo/dgr;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lo/dgr$1;->c:Lo/dgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 371
    iget-object v0, p0, Lo/dgr$1;->c:Lo/dgr;

    iget-object v1, p0, Lo/dgr$1;->c:Lo/dgr;

    iget-object v1, v1, Lo/dgr;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dgr;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 372
    return-void
.end method
