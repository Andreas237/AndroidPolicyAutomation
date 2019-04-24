.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->checkLocationPermission()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult([I)V
    .locals 4

    .line 291
    if-eqz p1, :cond_1

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    const/4 v1, 0x0

    aget v1, p1, v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$002(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Z)Z

    .line 296
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "permissionGranted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$100(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 300
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$100(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 302
    :goto_1
    return-void
.end method
