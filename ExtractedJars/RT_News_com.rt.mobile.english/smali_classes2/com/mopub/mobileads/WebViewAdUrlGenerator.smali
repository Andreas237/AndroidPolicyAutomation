.class public Lcom/mopub/mobileads/WebViewAdUrlGenerator;
.super Lcom/mopub/common/AdUrlGenerator;
.source "WebViewAdUrlGenerator.java"


# instance fields
.field private final mIsStorePictureSupported:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/mopub/common/AdUrlGenerator;-><init>(Landroid/content/Context;)V

    .line 14
    iput-boolean p2, p0, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->mIsStorePictureSupported:Z

    return-void
.end method


# virtual methods
.method public generateUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "/m/ad"

    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->initUrlString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "6"

    .line 21
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->setApiVersion(Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->addBaseParams(Lcom/mopub/common/ClientMetadata;)V

    const/4 p1, 0x1

    .line 26
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->setMraidFlag(Z)V

    .line 28
    iget-boolean p1, p0, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->mIsStorePictureSupported:Z

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->setExternalStoragePermission(Z)V

    .line 30
    invoke-virtual {p0}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->getFinalUrlString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
