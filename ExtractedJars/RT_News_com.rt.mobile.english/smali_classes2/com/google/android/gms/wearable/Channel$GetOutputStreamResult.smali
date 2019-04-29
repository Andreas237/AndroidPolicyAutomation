.class public interface abstract Lcom/google/android/gms/wearable/Channel$GetOutputStreamResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Releasable;
.implements Lcom/google/android/gms/common/api/Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/Channel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GetOutputStreamResult"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract getOutputStream()Ljava/io/OutputStream;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
