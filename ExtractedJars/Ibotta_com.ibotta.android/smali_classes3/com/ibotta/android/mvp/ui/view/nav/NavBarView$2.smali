.class Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$2;
.super Landroid/content/BroadcastReceiver;
.source "NavBarView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->registerUnlockListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 198
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->access$100(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;Landroid/content/Intent;)V

    return-void
.end method
