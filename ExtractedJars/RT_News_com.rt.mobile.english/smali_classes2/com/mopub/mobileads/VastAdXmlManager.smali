.class Lcom/mopub/mobileads/VastAdXmlManager;
.super Ljava/lang/Object;
.source "VastAdXmlManager.java"


# static fields
.field private static final INLINE:Ljava/lang/String; = "InLine"

.field private static final SEQUENCE:Ljava/lang/String; = "sequence"

.field private static final WRAPPER:Ljava/lang/String; = "Wrapper"


# instance fields
.field private final mAdNode:Lorg/w3c/dom/Node;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/w3c/dom/Node;)V
    .locals 0
    .param p1    # Lorg/w3c/dom/Node;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    iput-object p1, p0, Lcom/mopub/mobileads/VastAdXmlManager;->mAdNode:Lorg/w3c/dom/Node;

    return-void
.end method


# virtual methods
.method getInLineXmlManager()Lcom/mopub/mobileads/VastInLineXmlManager;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/mopub/mobileads/VastAdXmlManager;->mAdNode:Lorg/w3c/dom/Node;

    const-string v1, "InLine"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getFirstMatchingChildNode(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    new-instance v1, Lcom/mopub/mobileads/VastInLineXmlManager;

    invoke-direct {v1, v0}, Lcom/mopub/mobileads/VastInLineXmlManager;-><init>(Lorg/w3c/dom/Node;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method getSequence()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/VastAdXmlManager;->mAdNode:Lorg/w3c/dom/Node;

    const-string v1, "sequence"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getAttributeValue(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getWrapperXmlManager()Lcom/mopub/mobileads/VastWrapperXmlManager;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/mopub/mobileads/VastAdXmlManager;->mAdNode:Lorg/w3c/dom/Node;

    const-string v1, "Wrapper"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/XmlUtils;->getFirstMatchingChildNode(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v1, Lcom/mopub/mobileads/VastWrapperXmlManager;

    invoke-direct {v1, v0}, Lcom/mopub/mobileads/VastWrapperXmlManager;-><init>(Lorg/w3c/dom/Node;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
