.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showChooseTimerDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 1086
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$16;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/app/Dialog;IILjava/lang/String;)V
    .locals 0

    .line 1089
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 1090
    return-void
.end method
