.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$E3JQWVlRvRjlrdKrfoUl1upBPNc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/components/ClickableViewEvent;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$E3JQWVlRvRjlrdKrfoUl1upBPNc;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    return-void
.end method


# virtual methods
.method public final onClick()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$E3JQWVlRvRjlrdKrfoUl1upBPNc;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;->onCreateAccountLinkTapped()V

    return-void
.end method
