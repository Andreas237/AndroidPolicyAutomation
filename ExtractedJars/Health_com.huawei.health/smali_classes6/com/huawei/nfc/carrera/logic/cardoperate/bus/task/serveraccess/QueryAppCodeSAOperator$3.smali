.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;
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

    .line 354
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$3;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 357
    const-string v0, "================runnable \u65f6\u95f4\u5230\u505c\u6b62\u5b9a\u4f4d"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$3;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$500(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    .line 359
    return-void
.end method
