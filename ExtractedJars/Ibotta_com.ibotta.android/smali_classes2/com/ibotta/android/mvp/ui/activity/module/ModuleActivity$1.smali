.class Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "ModuleActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 75
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;Landroid/content/Intent;)V

    return-void
.end method
