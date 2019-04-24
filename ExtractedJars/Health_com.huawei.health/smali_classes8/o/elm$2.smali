.class Lo/elm$2;
.super Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/elm;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/elm;


# direct methods
.method constructor <init>(Lo/elm;Landroid/content/Context;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/elm$2;->b:Lo/elm;

    invoke-direct {p0, p2}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 83
    iget-object v0, p0, Lo/elm$2;->b:Lo/elm;

    invoke-static {v0}, Lo/elm;->a(Lo/elm;)Lo/elm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    iget-object v0, p0, Lo/elm$2;->b:Lo/elm;

    invoke-static {v0}, Lo/elm;->a(Lo/elm;)Lo/elm;

    move-result-object v0

    invoke-virtual {v0}, Lo/elm;->a()V

    .line 86
    :cond_0
    return-void
.end method
