.class Lo/agn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agn;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/agn;


# direct methods
.method constructor <init>(Lo/agn;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lo/agn$4;->b:Lo/agn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 109
    invoke-static {}, Lo/agn;->d()I

    move-result v0

    const/4 v1, -0x5

    if-ne v0, v1, :cond_0

    .line 110
    const/16 v0, 0x14

    invoke-static {v0}, Lo/agn;->d(I)I

    .line 111
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 112
    const/16 v0, 0x3ea

    iput v0, v2, Landroid/os/Message;->what:I

    .line 113
    iget-object v0, p0, Lo/agn$4;->b:Lo/agn;

    iget-object v0, v0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 114
    goto :goto_0

    :cond_0
    invoke-static {}, Lo/agn;->d()I

    move-result v0

    const/4 v1, -0x6

    if-ne v0, v1, :cond_1

    .line 115
    const/16 v0, 0x14

    invoke-static {v0}, Lo/agn;->d(I)I

    .line 116
    iget-object v0, p0, Lo/agn$4;->b:Lo/agn;

    invoke-static {v0}, Lo/agn;->b(Lo/agn;)V

    .line 118
    :cond_1
    :goto_0
    return-void
.end method
