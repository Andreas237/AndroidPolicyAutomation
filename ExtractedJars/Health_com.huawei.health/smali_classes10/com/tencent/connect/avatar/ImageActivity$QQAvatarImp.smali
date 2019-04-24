.class Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/avatar/ImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "QQAvatarImp"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->a:Lcom/tencent/connect/avatar/ImageActivity;

    .line 531
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 532
    return-void
.end method


# virtual methods
.method public setAvator(Landroid/graphics/Bitmap;Lcom/tencent/tauth/IUiListener;)V
    .locals 11

    .line 535
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v7

    .line 536
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 537
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x28

    invoke-virtual {p1, v0, v1, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 538
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v9

    .line 539
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 540
    new-instance v10, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v10, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 541
    const-string v0, "picture"

    invoke-virtual {v7, v0, v9}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 542
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user/set_user_face"

    move-object v3, v7

    const-string v4, "POST"

    move-object v5, v10

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 545
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SETAVATAR.SUCCEED"

    const-string v4, "12"

    const-string v5, "19"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    return-void
.end method
