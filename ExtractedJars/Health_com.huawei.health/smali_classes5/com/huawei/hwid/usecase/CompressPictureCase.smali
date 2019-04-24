.class public Lcom/huawei/hwid/usecase/CompressPictureCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/huawei/hwid/usecase/CompressPictureCase;->a:Landroid/content/Context;

    .line 25
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;)V
    .locals 7

    .line 28
    const-string v0, "CompressPictureCase"

    const-string v1, "startCompressPic"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;->a:Landroid/net/Uri;

    if-nez v0, :cond_1

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/CompressPictureCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1}, Lcom/huawei/hwid/UseCase$a;->b(Landroid/os/Bundle;)V

    .line 31
    return-void

    .line 33
    :cond_1
    const-string v0, "CompressPictureCase"

    const-string v1, "startCompressPic requestValues.mFromUri "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/huawei/hwid/usecase/CompressPictureCase;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/d/e;->a(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v4

    .line 35
    if-nez v4, :cond_2

    .line 36
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/CompressPictureCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1}, Lcom/huawei/hwid/UseCase$a;->b(Landroid/os/Bundle;)V

    .line 37
    return-void

    .line 40
    :cond_2
    const-string v0, "CompressPictureCase"

    const-string v1, "startCompressPic tmpUri"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/huawei/hwid/usecase/CompressPictureCase;->a:Landroid/content/Context;

    iget-object v1, p1, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;->a:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Z)Z

    .line 42
    iget-object v0, p0, Lcom/huawei/hwid/usecase/CompressPictureCase;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x1400

    invoke-static {v0, v1, v3, v2}, Lcom/huawei/hwid/d/e;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Z

    move-result v5

    .line 43
    if-eqz v5, :cond_3

    .line 44
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 45
    const-string v0, "request_pic_uri_tag"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 46
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/CompressPictureCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/huawei/hwid/UseCase$a;->a(Landroid/os/Bundle;)V

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/CompressPictureCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1}, Lcom/huawei/hwid/UseCase$a;->b(Landroid/os/Bundle;)V

    .line 51
    :goto_0
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 17
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/CompressPictureCase;->a(Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;)V

    return-void
.end method
