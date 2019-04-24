.class Lcom/myfitnesspal/android/sdk/MfpDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/myfitnesspal/android/sdk/MfpDialog;->createCrossImage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;


# direct methods
.method constructor <init>(Lcom/myfitnesspal/android/sdk/MfpDialog;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$1;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$1;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onCancel(Landroid/os/Bundle;)V

    .line 100
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$1;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->dismiss()V

    .line 101
    return-void
.end method
