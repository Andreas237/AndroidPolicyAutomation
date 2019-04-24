.class Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$5;->b:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 122
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServiceItemActivity.uninstallApk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$5;->b:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.webview"

    invoke-static {v0, v1}, Lo/dbf;->o(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    goto :goto_0

    .line 125
    :catch_0
    move-exception v4

    .line 126
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServiceItemActivity test"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    return-void
.end method
