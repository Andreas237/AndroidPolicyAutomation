.class public Lcom/ibotta/android/async/device/FcmTokenManager;
.super Ljava/lang/Object;
.source "FcmTokenManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;
    }
.end annotation


# static fields
.field private static final SCOPE:Ljava/lang/String; = "FCM"


# instance fields
.field private final asyncHandler:Landroid/os/Handler;

.field private final deleteTokenRunnable:Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;

.field private final firebaseInstanceId:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final firebaseSenderId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseInstanceId:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseSenderId:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->asyncHandler:Landroid/os/Handler;

    .line 26
    new-instance p1, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;-><init>(Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/async/device/FcmTokenManager$1;)V

    iput-object p1, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->deleteTokenRunnable:Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/async/device/FcmTokenManager;)Ljava/lang/String;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseSenderId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/async/device/FcmTokenManager;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseInstanceId:Lcom/google/firebase/iid/FirebaseInstanceId;

    return-object p0
.end method


# virtual methods
.method public getFcmToken()Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseInstanceId:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->firebaseSenderId:Ljava/lang/String;

    const-string v2, "FCM"

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->getToken(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get FCM token."

    const/4 v2, 0x0

    .line 36
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public onLogOut(Z)V
    .locals 1

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->asyncHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ibotta/android/async/device/FcmTokenManager;->deleteTokenRunnable:Lcom/ibotta/android/async/device/FcmTokenManager$DeleteToken;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
