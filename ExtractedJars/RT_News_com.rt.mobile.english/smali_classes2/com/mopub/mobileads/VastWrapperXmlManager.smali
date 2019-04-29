.class Lcom/mopub/mobileads/VastWrapperXmlManager;
.super Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;
.source "VastWrapperXmlManager.java"


# static fields
.field private static final VAST_AD_TAG:Ljava/lang/String; = "VASTAdTagURI"


# direct methods
.method constructor <init>(Lorg/w3c/dom/Node;)V
    .locals 0
    .param p1    # Lorg/w3c/dom/Node;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;-><init>(Lorg/w3c/dom/Node;)V

    .line 26
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method getVastAdTagURI()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/mopub/mobileads/VastWrapperXmlManager;->mNode:Lorg/w3c/dom/Node;

    const-string v1, "VASTAdTagURI"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getFirstMatchingChildNode(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/mopub/mobileads/util/XmlUtils;->getNodeValue(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
