.class Lcom/squareup/leakcanary/AndroidHeapDumper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/AndroidHeapDumper;->cancelToast(Landroid/widget/Toast;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/AndroidHeapDumper;

.field final synthetic val$toast:Landroid/widget/Toast;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/AndroidHeapDumper;Landroid/widget/Toast;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/squareup/leakcanary/AndroidHeapDumper$2;->this$0:Lcom/squareup/leakcanary/AndroidHeapDumper;

    iput-object p2, p0, Lcom/squareup/leakcanary/AndroidHeapDumper$2;->val$toast:Landroid/widget/Toast;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/squareup/leakcanary/AndroidHeapDumper$2;->val$toast:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 96
    return-void
.end method
