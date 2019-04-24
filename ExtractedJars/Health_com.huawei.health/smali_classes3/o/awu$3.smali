.class final Lo/awu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awu;->a(Ljava/lang/String;Landroid/os/Handler;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 364
    iput-object p1, p0, Lo/awu$3;->b:Ljava/lang/String;

    iput-object p2, p0, Lo/awu$3;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 364
    invoke-virtual {p0, p1}, Lo/awu$3;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 368
    const/4 v2, 0x0

    .line 369
    invoke-static {}, Lo/awc;->a()Lo/awc;

    move-result-object v0

    iget-object v1, p0, Lo/awu$3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/awc;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 371
    iget-object v0, p0, Lo/awu$3;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 372
    const/16 v0, 0x305

    iput v0, v3, Landroid/os/Message;->what:I

    .line 373
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 374
    const-string v0, "keySearchContact"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 375
    const-string v0, "keySearchContent"

    iget-object v1, p0, Lo/awu$3;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    invoke-virtual {v3, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 377
    iget-object v0, p0, Lo/awu$3;->a:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 379
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
