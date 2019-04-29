.class Lcom/mopub/mobileads/VastMediaXmlManager;
.super Ljava/lang/Object;
.source "VastMediaXmlManager.java"


# static fields
.field private static final DELIVERY:Ljava/lang/String; = "delivery"

.field private static final HEIGHT:Ljava/lang/String; = "height"

.field private static final VIDEO_TYPE:Ljava/lang/String; = "type"

.field private static final WIDTH:Ljava/lang/String; = "width"


# instance fields
.field private final mMediaNode:Lorg/w3c/dom/Node;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/w3c/dom/Node;)V
    .locals 1
    .param p1    # Lorg/w3c/dom/Node;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "mediaNode cannot be null"

    .line 25
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iput-object p1, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    return-void
.end method


# virtual methods
.method getDelivery()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    const-string v1, "delivery"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getAttributeValue(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getHeight()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    const-string v1, "height"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getAttributeValueAsInt(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method getMediaUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    invoke-static {v0}, Lcom/mopub/mobileads/util/XmlUtils;->getNodeValue(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getType()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getAttributeValue(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getWidth()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/mopub/mobileads/VastMediaXmlManager;->mMediaNode:Lorg/w3c/dom/Node;

    const-string v1, "width"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getAttributeValueAsInt(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
