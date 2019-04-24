.class Lo/der$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/der$2;


# direct methods
.method constructor <init>(Lo/der$2;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lo/der$2$3;->a:Lo/der$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;Ljava/lang/String;Z)V
    .locals 1

    .line 204
    iget-object v0, p0, Lo/der$2$3;->a:Lo/der$2;

    iget-object v0, v0, Lo/der$2;->d:Lo/dgg;

    invoke-interface {v0, p1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 205
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 201
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;

    invoke-virtual {p0, v0, p2, p3}, Lo/der$2$3;->e(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;Ljava/lang/String;Z)V

    return-void
.end method
