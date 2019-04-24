.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$rID0pvJuQyeAYz91o1tVo4RmgqM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/components/ClickableViewEvent;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$rID0pvJuQyeAYz91o1tVo4RmgqM;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;

    return-void
.end method


# virtual methods
.method public final onClick()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$rID0pvJuQyeAYz91o1tVo4RmgqM;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;->onContactIbottaCareTapped()V

    return-void
.end method
