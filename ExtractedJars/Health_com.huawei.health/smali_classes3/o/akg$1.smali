.class Lo/akg$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akg;


# direct methods
.method constructor <init>(Lo/akg;)V
    .locals 0

    .line 729
    iput-object p1, p0, Lo/akg$1;->a:Lo/akg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(I)V
    .locals 4

    .line 738
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mRegisterCallBack error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 739
    iget-object v0, p0, Lo/akg$1;->a:Lo/akg;

    invoke-static {v0, p1}, Lo/akg;->b(Lo/akg;I)V

    .line 740
    return-void
.end method

.method public onStatus(I)V
    .locals 0

    .line 744
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 733
    iget-object v0, p0, Lo/akg$1;->a:Lo/akg;

    invoke-static {v0, p1}, Lo/akg;->e(Lo/akg;Ljava/lang/Object;)V

    .line 734
    return-void
.end method
