.class Lo/dlf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lo/dlf$4;->a:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 540
    iget-object v0, p0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    iget-object v1, p0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v1}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/dlf$4$3;

    invoke-direct {v2, p0}, Lo/dlf$4$3;-><init>(Lo/dlf$4;)V

    invoke-virtual {v0, v1, v2}, Lo/dlz;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 556
    return-void
.end method
