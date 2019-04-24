.class Lo/ahr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ahr;


# direct methods
.method constructor <init>(Lo/ahr;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lo/ahr$4;->e:Lo/ahr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 4

    .line 186
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDeviceResource resultCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " resultValue,"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    const-string v0, "group"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ahr$4;->e:Lo/ahr;

    invoke-static {v0}, Lo/ahr;->i(Lo/ahr;)Lo/ahr$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lo/ahr$4;->e:Lo/ahr;

    invoke-static {v0}, Lo/ahr;->i(Lo/ahr;)Lo/ahr$e;

    move-result-object v0

    const/16 v1, 0x103

    invoke-virtual {v0, v1}, Lo/ahr$e;->removeMessages(I)V

    .line 189
    iget-object v0, p0, Lo/ahr$4;->e:Lo/ahr;

    invoke-static {v0}, Lo/ahr;->i(Lo/ahr;)Lo/ahr$e;

    move-result-object v0

    const/16 v1, 0x103

    invoke-virtual {v0, v1}, Lo/ahr$e;->sendEmptyMessage(I)Z

    .line 191
    :cond_0
    return-void
.end method
