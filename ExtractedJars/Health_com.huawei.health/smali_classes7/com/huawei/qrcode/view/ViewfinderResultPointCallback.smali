.class public final Lcom/huawei/qrcode/view/ViewfinderResultPointCallback;
.super Ljava/lang/Object;

# interfaces
.implements Lo/oy;


# instance fields
.field private final viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;


# direct methods
.method public constructor <init>(Lcom/huawei/qrcode/view/ViewfinderView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/view/ViewfinderResultPointCallback;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    return-void
.end method


# virtual methods
.method public foundPossibleResultPoint(Lo/ou;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderResultPointCallback;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/view/ViewfinderView;->addPossibleResultPoint(Lo/ou;)V

    return-void
.end method
