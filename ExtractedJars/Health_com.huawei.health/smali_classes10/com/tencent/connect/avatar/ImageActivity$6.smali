.class Lcom/tencent/connect/avatar/ImageActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/avatar/ImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;


# direct methods
.method constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;)V
    .locals 0

    .line 706
    iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(I)V
    .locals 2

    .line 743
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->n(Lcom/tencent/connect/avatar/ImageActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 744
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->o(Lcom/tencent/connect/avatar/ImageActivity;)V

    .line 748
    :cond_0
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    .line 740
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 7

    .line 714
    move-object v4, p1

    check-cast v4, Lorg/json/JSONObject;

    .line 715
    const/4 v5, -0x1

    .line 717
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move v5, v0

    .line 718
    if-nez v5, :cond_0

    .line 719
    const-string v0, "nickname"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 720
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->m(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$6$1;

    invoke-direct {v1, p0, v6}, Lcom/tencent/connect/avatar/ImageActivity$6$1;-><init>(Lcom/tencent/connect/avatar/ImageActivity$6;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 726
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "10659"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V

    .line 727
    goto :goto_0

    .line 728
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "10661"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 732
    :goto_0
    goto :goto_1

    .line 730
    :catch_0
    move-exception v6

    .line 731
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 733
    :goto_1
    if-eqz v5, :cond_1

    .line 734
    invoke-direct {p0, v5}, Lcom/tencent/connect/avatar/ImageActivity$6;->a(I)V

    .line 736
    :cond_1
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 709
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity$6;->a(I)V

    .line 710
    return-void
.end method
