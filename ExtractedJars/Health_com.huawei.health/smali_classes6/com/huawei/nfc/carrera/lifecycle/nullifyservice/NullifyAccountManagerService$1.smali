.class Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->handleDeletelocalcardCallback(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService$1;->this$0:Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService$1;->this$0:Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;->access$000(Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;)V

    .line 172
    return-void
.end method
