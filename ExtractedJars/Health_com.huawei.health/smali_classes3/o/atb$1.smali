.class Lo/atb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atb;->a(IJ)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/atb;

.field final synthetic b:J

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/atb;JI)V
    .locals 0

    .line 144
    iput-object p1, p0, Lo/atb$1;->a:Lo/atb;

    iput-wide p2, p0, Lo/atb$1;->b:J

    iput p4, p0, Lo/atb$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 144
    invoke-virtual {p0, p1}, Lo/atb$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 148
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v2

    .line 149
    iget-wide v0, p0, Lo/atb$1;->b:J

    invoke-virtual {v2, v0, v1}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 150
    iget-object v0, p0, Lo/atb$1;->a:Lo/atb;

    invoke-static {v0}, Lo/atb;->b(Lo/atb;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lo/atb$1;->a:Lo/atb;

    invoke-static {v0}, Lo/atb;->b(Lo/atb;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 153
    iget v0, p0, Lo/atb$1;->d:I

    iput v0, v4, Landroid/os/Message;->what:I

    .line 154
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 155
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 156
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 157
    iget-object v0, p0, Lo/atb$1;->a:Lo/atb;

    invoke-static {v0}, Lo/atb;->b(Lo/atb;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 159
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
