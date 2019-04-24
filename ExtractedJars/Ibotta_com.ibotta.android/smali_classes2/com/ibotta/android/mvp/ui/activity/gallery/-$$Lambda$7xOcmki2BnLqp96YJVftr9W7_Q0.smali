.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/EventContextProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/EventContextProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;->f$0:Lcom/ibotta/android/tracking/EventContextProvider;

    return-void
.end method


# virtual methods
.method public final contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;->f$0:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
