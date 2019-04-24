.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/EventContextProvider;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

.field private final synthetic f$1:Lcom/ibotta/android/tracking/EventContextProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;->f$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;->f$1:Lcom/ibotta/android/tracking/EventContextProvider;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;->f$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;->f$1:Lcom/ibotta/android/tracking/EventContextProvider;

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;->lambda$provideGalleryDetailEventContextProvider$0(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/tracking/EventContextProvider$-CC;->$default$provideContext(Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
