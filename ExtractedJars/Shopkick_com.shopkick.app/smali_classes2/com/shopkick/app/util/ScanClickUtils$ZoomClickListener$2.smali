.class Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$2;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$2;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$2;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$000(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->dismiss()V

    return-void
.end method
