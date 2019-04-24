.class Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->initViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;->this$0:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;->this$0:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    invoke-static {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->access$000(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;->this$0:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    invoke-static {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->access$000(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;->onDelKeyLongClick()V

    .line 201
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
