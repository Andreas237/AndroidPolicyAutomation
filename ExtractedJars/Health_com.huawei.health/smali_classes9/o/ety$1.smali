.class Lo/ety$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ety;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ety;


# direct methods
.method constructor <init>(Lo/ety;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/ety$1;->d:Lo/ety;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 84
    invoke-static {}, Lo/ety;->c()I

    move-result v0

    const/4 v1, -0x5

    if-ne v0, v1, :cond_0

    .line 85
    const/16 v0, 0xc

    invoke-static {v0}, Lo/ety;->e(I)I

    .line 86
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 87
    const/16 v0, 0x3ea

    iput v0, v2, Landroid/os/Message;->what:I

    .line 88
    iget-object v0, p0, Lo/ety$1;->d:Lo/ety;

    iget-object v0, v0, Lo/ety;->e:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 89
    goto :goto_0

    :cond_0
    invoke-static {}, Lo/ety;->c()I

    move-result v0

    const/4 v1, -0x6

    if-ne v0, v1, :cond_1

    .line 90
    const/16 v0, 0xc

    invoke-static {v0}, Lo/ety;->e(I)I

    .line 91
    iget-object v0, p0, Lo/ety$1;->d:Lo/ety;

    invoke-static {v0}, Lo/ety;->b(Lo/ety;)V

    .line 93
    :cond_1
    :goto_0
    return-void
.end method
