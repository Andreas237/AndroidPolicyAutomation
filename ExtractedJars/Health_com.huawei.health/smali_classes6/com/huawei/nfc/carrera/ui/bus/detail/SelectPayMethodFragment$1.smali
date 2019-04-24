.class Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;)Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->setSelectPostion(I)V

    .line 275
    return-void
.end method
