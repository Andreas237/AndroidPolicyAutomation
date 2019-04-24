.class public Lcom/google/android/gms/wallet/AutoResolveHelper;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/AutoResolveHelper$zza;,
        Lcom/google/android/gms/wallet/AutoResolveHelper$zzb;
    }
.end annotation


# static fields
.field public static final RESULT_ERROR:I = 0x1

.field private static final zzo:J

.field static zzp:J
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/wallet/AutoResolveHelper;->zzo:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/wallet/AutoResolveHelper;->zzp:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getStatusFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.api.AutoResolveHelper.status"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/common/api/Status;

    return-object p0
.end method

.method public static putStatusIntoIntent(Landroid/content/Intent;Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const-string p1, "com.google.android.gms.common.api.AutoResolveHelper.status"

    invoke-virtual {p0, p1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "com.google.android.gms.common.api.AutoResolveHelper.status"

    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-void
.end method

.method public static resolveTask(Lcom/google/android/gms/tasks/Task;Landroid/app/Activity;I)V
    .locals 2
    .param p0    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult::",
            "Lcom/google/android/gms/wallet/AutoResolvableResult;",
            ">(",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;",
            "Landroid/app/Activity;",
            "I)V"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/wallet/AutoResolveHelper$zza;->zza(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/wallet/AutoResolveHelper$zza;

    move-result-object p0

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/wallet/AutoResolveHelper$zza;->zzt:I

    invoke-static {v0, p2}, Lcom/google/android/gms/wallet/AutoResolveHelper$zzb;->zzb(II)Landroid/app/Fragment;

    move-result-object p2

    iget p0, p0, Lcom/google/android/gms/wallet/AutoResolveHelper$zza;->zzt:I

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "com.google.android.gms.wallet.AutoResolveHelper"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commit()I

    return-void
.end method

.method static synthetic zza()J
    .locals 2

    sget-wide v0, Lcom/google/android/gms/wallet/AutoResolveHelper;->zzo:J

    return-wide v0
.end method

.method private static zza(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, p1, p3, v0}, Landroid/app/Activity;->createPendingResult(ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "AutoResolveHelper"

    const/4 p1, 0x5

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "AutoResolveHelper"

    const-string p1, "Null pending result returned when trying to deliver task result!"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0, p2}, Landroid/app/PendingIntent;->send(I)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "AutoResolveHelper"

    const/4 p2, 0x6

    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "AutoResolveHelper"

    const-string p2, "Exception sending pending result"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return-void
.end method

.method private static zza(Landroid/app/Activity;ILcom/google/android/gms/tasks/Task;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I",
            "Lcom/google/android/gms/tasks/Task<",
            "+",
            "Lcom/google/android/gms/wallet/AutoResolvableResult;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "AutoResolveHelper"

    const/4 p1, 0x3

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "AutoResolveHelper"

    const-string p1, "Ignoring task result for, Activity is finishing."

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/common/api/ResolvableApiException;

    const/4 v1, 0x6

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/common/api/ResolvableApiException;

    :try_start_0
    invoke-virtual {p2, p0, p1}, Lcom/google/android/gms/common/api/ResolvableApiException;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "AutoResolveHelper"

    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "AutoResolveHelper"

    const-string p2, "Error starting pending intent!"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return-void

    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    const/4 v3, -0x1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/wallet/AutoResolvableResult;

    invoke-interface {p2, v0}, Lcom/google/android/gms/wallet/AutoResolvableResult;->putIntoIntent(Landroid/content/Intent;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v2

    instance-of v2, v2, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v2, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/common/api/ApiException;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/ApiException;->getStatusCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/ApiException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v4, 0x0

    invoke-direct {v1, v2, p2, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/wallet/AutoResolveHelper;->putStatusIntoIntent(Landroid/content/Intent;Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_4
    const-string v2, "AutoResolveHelper"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "AutoResolveHelper"

    const-string v2, "Unexpected non API exception!"

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    invoke-static {v1, v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_5
    new-instance p2, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x8

    const-string v2, "Unexpected non API exception when trying to deliver the task result to an activity!"

    invoke-direct {p2, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/wallet/AutoResolveHelper;->putStatusIntoIntent(Landroid/content/Intent;Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    invoke-static {p0, p1, v3, v0}, Lcom/google/android/gms/wallet/AutoResolveHelper;->zza(Landroid/app/Activity;IILandroid/content/Intent;)V

    :cond_6
    return-void
.end method

.method public static zza(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/Status;",
            "TTResult;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/common/internal/ApiExceptionUtil;->fromStatus(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic zzb(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/wallet/AutoResolveHelper;->zza(Landroid/app/Activity;IILandroid/content/Intent;)V

    return-void
.end method

.method static synthetic zzb(Landroid/app/Activity;ILcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/AutoResolveHelper;->zza(Landroid/app/Activity;ILcom/google/android/gms/tasks/Task;)V

    return-void
.end method
