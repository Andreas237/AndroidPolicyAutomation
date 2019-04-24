.class Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;
.super Ljava/lang/Object;
.source "FcmTokenManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/async/device/FcmTokenManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DeleteToken"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/async/device/FcmTokenManager;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/async/device/FcmTokenManager;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;->this$0:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/async/device/FcmTokenManager$1;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;-><init>(Lcom/ibotta/android/async/device/FcmTokenManager;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const/4 v0, 0x0

    .line 51
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;->this$0:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-static {v1}, Lcom/ibotta/android/async/device/FcmTokenManager;->access$200(Lcom/ibotta/android/async/device/FcmTokenManager;)Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;->this$0:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-static {v2}, Lcom/ibotta/android/async/device/FcmTokenManager;->access$100(Lcom/ibotta/android/async/device/FcmTokenManager;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "FCM"

    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->deleteToken(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Deleted FCM token."

    .line 52
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v1, p0, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;->this$0:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-static {v1}, Lcom/ibotta/android/async/device/FcmTokenManager;->access$200(Lcom/ibotta/android/async/device/FcmTokenManager;)Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->getToken()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to delete FCM token."

    .line 57
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
