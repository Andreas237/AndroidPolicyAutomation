.class Lo/exs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exa$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exs;->e(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exs;


# direct methods
.method constructor <init>(Lo/exs;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lo/exs$3;->a:Lo/exs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;I)V
    .locals 2

    .line 336
    iget-object v0, p0, Lo/exs$3;->a:Lo/exs;

    iget-object v1, p0, Lo/exs$3;->a:Lo/exs;

    invoke-static {v1}, Lo/exs;->f(Lo/exs;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/openservice/db/model/ChildService;

    invoke-static {v0, v1}, Lo/exs;->c(Lo/exs;Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 337
    return-void
.end method
