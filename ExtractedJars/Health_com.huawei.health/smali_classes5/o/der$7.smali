.class Lo/der$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->b(Ljava/lang/String;Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/dgg;

.field final synthetic e:Lo/der;


# direct methods
.method constructor <init>(Lo/der;Lo/dgg;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lo/der$7;->e:Lo/der;

    iput-object p2, p0, Lo/der$7;->c:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;Ljava/lang/String;Z)V
    .locals 1

    .line 259
    iget-object v0, p0, Lo/der$7;->c:Lo/dgg;

    invoke-interface {v0, p1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 260
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 256
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;

    invoke-virtual {p0, v0, p2, p3}, Lo/der$7;->c(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;Ljava/lang/String;Z)V

    return-void
.end method
