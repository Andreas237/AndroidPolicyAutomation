.class Lo/esv$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esv;


# direct methods
.method constructor <init>(Lo/esv;)V
    .locals 0

    .line 1447
    iput-object p1, p0, Lo/esv$9;->b:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 1450
    iget-object v0, p0, Lo/esv$9;->b:Lo/esv;

    invoke-static {v0}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1451
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1452
    iget-object v0, p0, Lo/esv$9;->b:Lo/esv;

    invoke-static {v0}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1453
    return-void
.end method
