.class Lo/cys$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cys$1;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cyi;

.field final synthetic c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field final synthetic e:Lo/cys$1;


# direct methods
.method constructor <init>(Lo/cys$1;Lo/cyi;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 1354
    iput-object p1, p0, Lo/cys$1$4;->e:Lo/cys$1;

    iput-object p2, p0, Lo/cys$1$4;->a:Lo/cyi;

    iput-object p3, p0, Lo/cys$1$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1357
    iget-object v0, p0, Lo/cys$1$4;->a:Lo/cyi;

    iget-object v1, p0, Lo/cys$1$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v1}, Lo/cyi;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1358
    return-void
.end method
