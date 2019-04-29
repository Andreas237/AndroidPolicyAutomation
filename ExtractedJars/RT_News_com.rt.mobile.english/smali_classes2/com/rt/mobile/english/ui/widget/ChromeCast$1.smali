.class Lcom/rt/mobile/english/ui/widget/ChromeCast$1;
.super Landroid/support/v7/media/MediaRouter$Callback;
.source "ChromeCast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$1;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-direct {p0}, Landroid/support/v7/media/MediaRouter$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRouteSelected(Landroid/support/v7/media/MediaRouter;Landroid/support/v7/media/MediaRouter$RouteInfo;)V
    .locals 0

    .line 95
    invoke-virtual {p2}, Landroid/support/v7/media/MediaRouter$RouteInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/cast/CastDevice;->getFromBundle(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object p1

    .line 96
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$1;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$000(Lcom/rt/mobile/english/ui/widget/ChromeCast;Lcom/google/android/gms/cast/CastDevice;)V

    return-void
.end method

.method public onRouteUnselected(Landroid/support/v7/media/MediaRouter;Landroid/support/v7/media/MediaRouter$RouteInfo;)V
    .locals 0

    .line 102
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$1;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$000(Lcom/rt/mobile/english/ui/widget/ChromeCast;Lcom/google/android/gms/cast/CastDevice;)V

    return-void
.end method
