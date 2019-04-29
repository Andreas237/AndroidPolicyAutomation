.class public interface abstract Lcom/google/android/gms/wearable/MessageClient$OnMessageReceivedListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/MessageApi$MessageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/MessageClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnMessageReceivedListener"
.end annotation


# virtual methods
.method public abstract onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V
    .param p1    # Lcom/google/android/gms/wearable/MessageEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
