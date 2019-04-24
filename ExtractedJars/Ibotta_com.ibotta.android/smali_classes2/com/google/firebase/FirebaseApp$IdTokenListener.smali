.class public interface abstract Lcom/google/firebase/FirebaseApp$IdTokenListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/FirebaseApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IdTokenListener"
.end annotation


# virtual methods
.method public abstract onIdTokenChanged(Lcom/google/firebase/internal/InternalTokenResult;)V
    .param p1    # Lcom/google/firebase/internal/InternalTokenResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
