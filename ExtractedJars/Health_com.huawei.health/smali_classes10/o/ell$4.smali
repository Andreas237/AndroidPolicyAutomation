.class Lo/ell$4;
.super Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ell;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ell;


# direct methods
.method constructor <init>(Lo/ell;Landroid/content/Context;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/ell$4;->b:Lo/ell;

    invoke-direct {p0, p2}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/ell$4;->b:Lo/ell;

    invoke-static {v0}, Lo/ell;->d(Lo/ell;)Lo/ell;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/ell$4;->b:Lo/ell;

    invoke-static {v0}, Lo/ell;->d(Lo/ell;)Lo/ell;

    move-result-object v0

    invoke-virtual {v0}, Lo/ell;->e()V

    .line 84
    :cond_0
    return-void
.end method
