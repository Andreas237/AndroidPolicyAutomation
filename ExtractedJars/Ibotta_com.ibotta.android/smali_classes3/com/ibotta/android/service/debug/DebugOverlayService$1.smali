.class Lcom/ibotta/android/service/debug/DebugOverlayService$1;
.super Landroid/content/BroadcastReceiver;
.source "DebugOverlayService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/service/debug/DebugOverlayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/service/debug/DebugOverlayService;


# direct methods
.method constructor <init>(Lcom/ibotta/android/service/debug/DebugOverlayService;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService$1;->this$0:Lcom/ibotta/android/service/debug/DebugOverlayService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService$1;->this$0:Lcom/ibotta/android/service/debug/DebugOverlayService;

    invoke-static {p1, p2}, Lcom/ibotta/android/service/debug/DebugOverlayService;->access$000(Lcom/ibotta/android/service/debug/DebugOverlayService;Landroid/content/Intent;)V

    return-void
.end method
