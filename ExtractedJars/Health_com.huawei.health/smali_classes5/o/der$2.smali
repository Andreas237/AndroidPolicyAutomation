.class Lo/der$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->d(Ljava/lang/String;Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/der;

.field final synthetic d:Lo/dgg;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/der;Ljava/lang/String;Lo/dgg;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/der$2;->a:Lo/der;

    iput-object p2, p0, Lo/der$2;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/der$2;->d:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 199
    new-instance v2, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;-><init>()V

    .line 200
    iget-object v0, p0, Lo/der$2;->e:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;->setDevId(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lo/der$2;->a:Lo/der;

    invoke-static {v0}, Lo/der;->a(Lo/der;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/der$2$3;

    invoke-direct {v1, p0}, Lo/der$2$3;-><init>(Lo/der$2;)V

    invoke-virtual {v0, v2, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx;)V

    .line 207
    return-void
.end method
