.class public abstract Lcom/ibotta/android/view/model/content/AbstractContentItem;
.super Ljava/lang/Object;
.source "AbstractContentItem.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/ibotta/api/model/ContentModel;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/tracking/proprietary/event/EventContributor;"
    }
.end annotation


# instance fields
.field private final contentModel:Lcom/ibotta/api/model/ContentModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private index:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private style:Lcom/ibotta/android/views/content/ContentStyle;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/ContentModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    iput-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->style:Lcom/ibotta/android/views/content/ContentStyle;

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contentModel:Lcom/ibotta/api/model/ContentModel;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 1
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/EventChain;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    iput-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->style:Lcom/ibotta/android/views/content/ContentStyle;

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contentModel:Lcom/ibotta/api/model/ContentModel;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->index:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setListIndex(Ljava/lang/Integer;)V

    return-void
.end method

.method public abstract copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
.end method

.method copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->style:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->index:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->setIndex(Ljava/lang/Integer;)V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    :cond_1
    return-void
.end method

.method public getContentModel()Lcom/ibotta/api/model/ContentModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contentModel:Lcom/ibotta/api/model/ContentModel;

    return-object v0
.end method

.method public getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-object v0
.end method

.method public getIndex()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStyle()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->style:Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0
.end method

.method public setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 0

    .line 41
    invoke-virtual {p1, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->createLink(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-void
.end method

.method public setIndex(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->index:Ljava/lang/Integer;

    return-void
.end method

.method public setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractContentItem;->style:Lcom/ibotta/android/views/content/ContentStyle;

    return-void
.end method
