.class Lcom/usebutton/sdk/internal/NotificationFactory$1;
.super Ljava/lang/Object;
.source "NotificationFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/NotificationFactory;->displayAppToAppNotification(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/NotificationFactory;Landroid/content/Intent;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 98
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

    const-string v1, "APP_TO_APP_NOTIFICATION_TITLE"

    sget v2, Lcom/usebutton/sdk/R$string;->btn_app_to_app_notification_title:I

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v4}, Lcom/usebutton/sdk/internal/NotificationFactory;->access$100(Lcom/usebutton/sdk/internal/NotificationFactory;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 99
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 100
    iget-object v1, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

    const-string v2, "APP_TO_APP_NOTIFICATION_BODY"

    sget v4, Lcom/usebutton/sdk/R$string;->btn_app_to_app_notification_body:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

    iget-object v7, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->val$intent:Landroid/content/Intent;

    .line 102
    invoke-static {v6, v7}, Lcom/usebutton/sdk/internal/NotificationFactory;->access$200(Lcom/usebutton/sdk/internal/NotificationFactory;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    .line 100
    invoke-static {v1, v2, v4, v5}, Lcom/usebutton/sdk/internal/NotificationFactory;->access$100(Lcom/usebutton/sdk/internal/NotificationFactory;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 102
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 104
    iget-object v2, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->this$0:Lcom/usebutton/sdk/internal/NotificationFactory;

    sget-object v3, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->APP_TO_APP_NOTIFICATION:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/NotificationFactory$1;->val$intent:Landroid/content/Intent;

    invoke-static {v2, v3, v4, v0, v1}, Lcom/usebutton/sdk/internal/NotificationFactory;->access$300(Lcom/usebutton/sdk/internal/NotificationFactory;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
