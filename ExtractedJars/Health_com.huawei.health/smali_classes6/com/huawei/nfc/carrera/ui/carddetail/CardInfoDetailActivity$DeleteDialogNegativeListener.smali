.class Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$DeleteDialogNegativeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DeleteDialogNegativeListener"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 379
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 384
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 385
    return-void
.end method
