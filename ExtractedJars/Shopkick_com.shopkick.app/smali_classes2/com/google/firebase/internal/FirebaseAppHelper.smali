.class public Lcom/google/firebase/internal/FirebaseAppHelper;
.super Ljava/lang/Object;
.source "com.google.firebase:firebase-common@@16.0.2"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addIdTokenListener(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/FirebaseApp$IdTokenListener;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/firebase/FirebaseApp;->addIdTokenListener(Lcom/google/firebase/FirebaseApp$IdTokenListener;)V

    return-void
.end method

.method public static getToken(Lcom/google/firebase/FirebaseApp;Z)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/auth/GetTokenResult;",
            ">;"
        }
    .end annotation

    .line 42
    invoke-virtual {p0, p1}, Lcom/google/firebase/FirebaseApp;->getToken(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static getUid(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/FirebaseApiNotAvailableException;
        }
    .end annotation

    .line 71
    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->getUid()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static removeIdTokenListener(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/FirebaseApp$IdTokenListener;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 61
    invoke-virtual {p0, p1}, Lcom/google/firebase/FirebaseApp;->removeIdTokenListener(Lcom/google/firebase/FirebaseApp$IdTokenListener;)V

    return-void
.end method
