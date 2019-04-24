.class Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->handleServerMsgResult(ZLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService$1;->this$0:Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService$1;->this$0:Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;->access$000(Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;)V

    .line 156
    return-void
.end method
