.class Lo/akv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akv;


# direct methods
.method constructor <init>(Lo/akv;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/akv$5;->a:Lo/akv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 106
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    .line 107
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already binder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/akv$5;->a:Lo/akv;

    invoke-virtual {v0}, Lo/akv;->f()V

    .line 110
    :cond_0
    return-void
.end method
