.class Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;
.super Ljava/lang/Object;
.source "CheckUpdateTaskWithUI.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->showDialog(Lorg/json/JSONArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

.field final synthetic val$updateInfo:Lorg/json/JSONArray;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    iput-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->val$updateInfo:Lorg/json/JSONArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 101
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    invoke-virtual {p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->getCachingEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 102
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    invoke-static {p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->access$000(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;)Landroid/app/Activity;

    move-result-object p1

    const-string p2, "[]"

    invoke-static {p1, p2}, Lnet/hockeyapp/android/utils/VersionCache;->setVersionInfo(Landroid/content/Context;Ljava/lang/String;)V

    .line 105
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    invoke-static {p2}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->access$000(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;)Landroid/app/Activity;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Lnet/hockeyapp/android/utils/Util;->fragmentsSupported()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Lnet/hockeyapp/android/utils/Util;->runsOnTablet(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 107
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    iget-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->val$updateInfo:Lorg/json/JSONArray;

    invoke-static {p1, p2}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->access$100(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->this$0:Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    iget-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;->val$updateInfo:Lorg/json/JSONArray;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->access$200(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;Ljava/lang/Boolean;)V

    :goto_0
    return-void
.end method
