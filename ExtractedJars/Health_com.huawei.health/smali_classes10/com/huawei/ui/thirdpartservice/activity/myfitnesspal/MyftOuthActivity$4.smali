.class Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/myfitnesspal/android/sdk/MfpAuthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;->a:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/os/Bundle;)V
    .locals 4

    .line 205
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onCancel= params "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;->a:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    .line 207
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 4

    .line 188
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onComplete= params "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;->a:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a(Landroid/os/Bundle;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;->a:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    .line 191
    return-void
.end method

.method public onError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V
    .locals 4

    .line 200
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onError= params "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    return-void
.end method

.method public onMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V
    .locals 4

    .line 195
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onMfpError= params "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void
.end method
