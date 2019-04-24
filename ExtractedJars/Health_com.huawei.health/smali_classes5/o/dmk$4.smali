.class Lo/dmk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmk;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dmi;

.field final synthetic d:Lo/dmk;

.field final synthetic e:Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;


# direct methods
.method constructor <init>(Lo/dmk;Lo/dmi;Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lo/dmk$4;->d:Lo/dmk;

    iput-object p2, p0, Lo/dmk$4;->c:Lo/dmi;

    iput-object p3, p0, Lo/dmk$4;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 218
    iget-object v0, p0, Lo/dmk$4;->c:Lo/dmi;

    iget-object v1, p0, Lo/dmk$4;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    invoke-interface {v0, v1}, Lo/dmi;->d(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V

    .line 219
    return-void
.end method
