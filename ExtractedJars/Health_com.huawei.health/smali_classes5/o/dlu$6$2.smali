.class Lo/dlu$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu$6;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlu$6;


# direct methods
.method constructor <init>(Lo/dlu$6;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lo/dlu$6$2;->b:Lo/dlu$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 430
    if-nez p1, :cond_0

    .line 431
    iget-object v0, p0, Lo/dlu$6$2;->b:Lo/dlu$6;

    iget-object v0, v0, Lo/dlu$6;->a:Lo/dlu;

    const-string v1, "show_service"

    iget-object v2, p0, Lo/dlu$6$2;->b:Lo/dlu$6;

    iget-object v2, v2, Lo/dlu$6;->e:Ljava/util/List;

    iget-object v3, p0, Lo/dlu$6$2;->b:Lo/dlu$6;

    iget-object v3, v3, Lo/dlu$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p2, v2, v3}, Lo/dlu;->b(Lo/dlu;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 433
    :cond_0
    return-void
.end method
