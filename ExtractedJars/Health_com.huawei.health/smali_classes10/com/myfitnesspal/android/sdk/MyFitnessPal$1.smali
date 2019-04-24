.class Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/myfitnesspal/android/sdk/MfpAuthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/myfitnesspal/android/sdk/MyFitnessPal;->startDialogAuth(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;


# direct methods
.method constructor <init>(Lcom/myfitnesspal/android/sdk/MyFitnessPal;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;->this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/os/Bundle;)V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;->this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-static {v0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->access$300(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Landroid/os/Bundle;)V

    .line 275
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 1

    .line 258
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 259
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;->this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-static {v0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->access$000(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Landroid/os/Bundle;)V

    .line 260
    return-void
.end method

.method public onError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;->this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-static {v0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->access$100(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Lcom/myfitnesspal/android/sdk/MfpWebError;)V

    .line 265
    return-void
.end method

.method public onMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;->this$0:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-static {v0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->access$200(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Lcom/myfitnesspal/android/sdk/MfpAuthError;)V

    .line 270
    return-void
.end method
