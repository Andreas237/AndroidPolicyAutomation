.class public interface abstract Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/DataApi$DataListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/DataClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnDataChangedListener"
.end annotation


# virtual methods
.method public abstract onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .param p1    # Lcom/google/android/gms/wearable/DataEventBuffer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
