.class Lcom/shopkick/app/presence/WalkinController$2;
.super Ljava/lang/Object;
.source "WalkinController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/WalkinController;->saveGeofencesToDisk()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/WalkinController;)V
    .locals 0

    .line 649
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController$2;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 652
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 653
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 654
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "WalkinController: Saving geofence mapping to disk."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 655
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController$2;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-static {v0}, Lcom/shopkick/app/presence/WalkinController;->access$000(Lcom/shopkick/app/presence/WalkinController;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "WalkinControllerGeofencesKey"

    .line 656
    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController$2;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-static {v2}, Lcom/shopkick/app/presence/WalkinController;->access$100(Lcom/shopkick/app/presence/WalkinController;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 657
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
